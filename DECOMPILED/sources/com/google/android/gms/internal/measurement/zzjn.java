package com.google.android.gms.internal.measurement;

import android.content.Context;
import p122P3.InterfaceC1214r;

/* JADX INFO: loaded from: classes2.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final InterfaceC1214r zzb;

    zzjn(Context context, InterfaceC1214r interfaceC1214r) {
        this.zza = context;
        this.zzb = interfaceC1214r;
    }

    public final boolean equals(Object obj) {
        InterfaceC1214r interfaceC1214r;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((interfaceC1214r = this.zzb) != null ? interfaceC1214r.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        InterfaceC1214r interfaceC1214r = this.zzb;
        return (iHashCode * 1000003) ^ (interfaceC1214r == null ? 0 : interfaceC1214r.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    final InterfaceC1214r zzb() {
        return this.zzb;
    }
}
