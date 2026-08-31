package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgup extends zzgrg {
    private final zzguo zza;
    private final int zzb;

    private zzgup(zzguo zzguoVar, int i7) {
        this.zza = zzguoVar;
        this.zzb = i7;
    }

    public static zzgup zzb(zzguo zzguoVar, int i7) throws GeneralSecurityException {
        if (i7 < 8 || i7 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzgup(zzguoVar, i7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgup)) {
            return false;
        }
        zzgup zzgupVar = (zzgup) obj;
        return zzgupVar.zza == this.zza && zzgupVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgup.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i7 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i7).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza != zzguo.zzb;
    }

    public final zzguo zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
