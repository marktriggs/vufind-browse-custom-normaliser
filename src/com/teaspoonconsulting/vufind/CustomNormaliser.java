package com.teaspoonconsulting.vufind;

import au.gov.nla.util.Normaliser;

public class CustomNormaliser extends Normaliser
{
    public byte[] normalise (String s)
    {
        String cleaned = s.replaceAll (" +", " ").trim();
        return collator.getCollationKey (cleaned).toByteArray ();
    }
}

