package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.AbstractC3735b;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbz extends AbstractC3735b {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e7) {
            Log.e("AUTH", "Error serializing object.", e7);
            return null;
        }
    }
}
