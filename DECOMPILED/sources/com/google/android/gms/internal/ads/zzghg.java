package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzghg extends zzgha {
    private final Object zza;

    zzghg(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzghg) {
            return this.zza.equals(((zzghg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 13);
        sb.append("Optional.of(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgha
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgha
    public final zzgha zzb(zzggr zzggrVar) {
        Object objApply = zzggrVar.apply(this.zza);
        zzghc.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzghg(objApply);
    }
}
