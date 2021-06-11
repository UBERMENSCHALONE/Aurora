package com.ufanet.aurora.exception;

public abstract class CustomException extends Exception
{
    public CustomException( String message )
    {
        super( message );
    }
}
