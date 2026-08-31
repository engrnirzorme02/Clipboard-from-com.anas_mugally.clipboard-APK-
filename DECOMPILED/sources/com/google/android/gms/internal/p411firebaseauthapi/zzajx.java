package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzajx implements Comparator<zzajv> {
    zzajx() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzajv zzajvVar, zzajv zzajvVar2) {
        zzajv zzajvVar3 = zzajvVar;
        zzajv zzajvVar4 = zzajvVar2;
        zzakb zzakbVar = (zzakb) zzajvVar3.iterator();
        zzakb zzakbVar2 = (zzakb) zzajvVar4.iterator();
        while (zzakbVar.hasNext() && zzakbVar2.hasNext()) {
            int iCompare = Integer.compare(zzajv.zza(zzakbVar.zza()), zzajv.zza(zzakbVar2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzajvVar3.zzb(), zzajvVar4.zzb());
    }
}
