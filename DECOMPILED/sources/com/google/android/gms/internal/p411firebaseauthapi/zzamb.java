package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzamb implements zzamj {
    private zzamj[] zza;

    zzamb(zzamj... zzamjVarArr) {
        this.zza = zzamjVarArr;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamj
    public final zzamk zza(Class<?> cls) {
        for (zzamj zzamjVar : this.zza) {
            if (zzamjVar.zzb(cls)) {
                return zzamjVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamj
    public final boolean zzb(Class<?> cls) {
        for (zzamj zzamjVar : this.zza) {
            if (zzamjVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
