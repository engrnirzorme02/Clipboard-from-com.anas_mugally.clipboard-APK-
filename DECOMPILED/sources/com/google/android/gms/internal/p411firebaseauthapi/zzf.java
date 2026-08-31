package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzf {
    protected zzf() {
    }

    public int zza(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        zzu.zza(i7, length, "index");
        while (i7 < length) {
            if (zza(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public abstract boolean zza(char c7);
}
