package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzs implements zzq {
    private zzs() {
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzq
    public final zzl zza(String str) {
        return new zzo(Pattern.compile(str));
    }
}
