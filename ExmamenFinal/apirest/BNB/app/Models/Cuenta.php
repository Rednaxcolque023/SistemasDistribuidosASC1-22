<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsTo;

class Cuenta extends Model
{
    protected $fillable = ['nrocuenta', 'saldo', 'cliente_id'];
    use HasFactory;
    public function clientes(){
        return $this->belongsTo('App\Models\Cliente');
    }
}
