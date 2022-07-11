<?php

namespace Database\Seeders;

use App\Models\User;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Str;
class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        User::factory(20)->create();
        User::Create([
            'name' => 'usuario',
            'email' => 'usuario',
            'email_verified_at' => now(),
            'password' =>Hash::make('123'), 
            'rol' => 'usuario',
            'remember_token' => Str::random(10)
        ]);
        User::Create([
            'name' => 'admin',
            'email' => 'admin',
            'email_verified_at' => now(),
            'password' =>Hash::make('456'), 
            'rol' => 'admin',
            'remember_token' => Str::random(10)
        ]);
    }
}
