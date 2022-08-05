<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cliente extends Model
{
    protected $fillable = ['nrodocumento', 'complemento', 'nombres', 'primerapellido', 'segundoapellido'];
    use HasFactory;
    //relacion 
    public function cuentas(){
        return $this->hasMany('App\Models\Cuenta');
    }
}
