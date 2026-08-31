package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzjs implements zzjw {
    zzjs() {
    }

    @Override // com.google.android.recaptcha.internal.zzjw
    public final zzjv zza(CharSequence charSequence, Charset charset) {
        zzjx zzjxVarZzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzjr) zzjxVarZzb).zza(bytes, 0, bytes.length);
        return zzjxVarZzb.zzb();
    }
}
