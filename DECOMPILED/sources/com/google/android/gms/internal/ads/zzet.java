package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzet extends zzev {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzet(int i7, long j7) {
        super(i7, null);
        this.zza = j7;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final String toString() {
        List list = this.zzb;
        String strZze = zzev.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb.append(strZze);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void zza(zzeu zzeuVar) {
        this.zzb.add(zzeuVar);
    }

    public final void zzb(zzet zzetVar) {
        this.zzc.add(zzetVar);
    }

    public final zzeu zzc(int i7) {
        List list = this.zzb;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            zzeu zzeuVar = (zzeu) list.get(i8);
            if (zzeuVar.zzd == i7) {
                return zzeuVar;
            }
        }
        return null;
    }

    public final zzet zzd(int i7) {
        List list = this.zzc;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            zzet zzetVar = (zzet) list.get(i8);
            if (zzetVar.zzd == i7) {
                return zzetVar;
            }
        }
        return null;
    }
}
