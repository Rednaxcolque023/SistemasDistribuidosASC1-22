<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class PersonaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        return [
            'nombres' => $this->faker->name(),
            'apellidos' => $this->faker->lastName(),
            'sexo' => $this->faker->randomElement(['M', 'F']),
            'estatura'=>$this->faker->randomElement(['1.78','1.50','1.70','1.60','1.80','1.90']),
        ];
    }
}
