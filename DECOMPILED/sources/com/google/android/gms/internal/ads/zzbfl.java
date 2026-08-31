package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.nativead.C3521b;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p314o2.C6574z;
import p340r2.C6887e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfl extends AbstractC1945a {
    public static final Parcelable.Creator<zzbfl> CREATOR = new zzbfm();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final C3321a2 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbfl(int i7, boolean z7, int i8, boolean z8, int i9, C3321a2 c3321a2, boolean z9, int i10, int i11, boolean z10, int i12) {
        this.zza = i7;
        this.zzb = z7;
        this.zzc = i8;
        this.zzd = z8;
        this.zze = i9;
        this.zzf = c3321a2;
        this.zzg = z9;
        this.zzh = i10;
        this.zzj = z10;
        this.zzi = i11;
        this.zzk = i12;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static C3521b zza(zzbfl zzbflVar) {
        C3521b.a aVar = new C3521b.a();
        if (zzbflVar == null) {
            return aVar.m17619a();
        }
        int i7 = zzbflVar.zza;
        int i8 = 2;
        if (i7 == 2) {
            aVar.m17621c(zzbflVar.zze);
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    aVar.m17623e(zzbflVar.zzg);
                    aVar.m17622d(zzbflVar.zzh);
                    aVar.m17620b(zzbflVar.zzi, zzbflVar.zzj);
                    int i9 = zzbflVar.zzk;
                    if (i9 == 0) {
                        i8 = 1;
                    } else if (i9 == 2) {
                        i8 = 3;
                    } else if (i9 != 1) {
                        i8 = 1;
                    }
                    aVar.m17635q(i8);
                }
            }
            C3321a2 c3321a2 = zzbflVar.zzf;
            if (c3321a2 != null) {
                aVar.m17626h(new C6574z(c3321a2));
            }
            aVar.m17621c(zzbflVar.zze);
        }
        aVar.m17625g(zzbflVar.zzb);
        aVar.m17624f(zzbflVar.zzd);
        return aVar.m17619a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8059g(parcel, 2, this.zzb);
        AbstractC1947c.m8072t(parcel, 3, this.zzc);
        AbstractC1947c.m8059g(parcel, 4, this.zzd);
        AbstractC1947c.m8072t(parcel, 5, this.zze);
        AbstractC1947c.m8042C(parcel, 6, this.zzf, i7, false);
        AbstractC1947c.m8059g(parcel, 7, this.zzg);
        AbstractC1947c.m8072t(parcel, 8, this.zzh);
        AbstractC1947c.m8072t(parcel, 9, this.zzi);
        AbstractC1947c.m8059g(parcel, 10, this.zzj);
        AbstractC1947c.m8072t(parcel, 11, this.zzk);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Deprecated
    public zzbfl(C6887e c6887e) {
        this(4, c6887e.m30095f(), c6887e.m30091b(), c6887e.m30094e(), c6887e.m30090a(), c6887e.m30093d() != null ? new C3321a2(c6887e.m30093d()) : null, c6887e.m30096g(), c6887e.m30092c(), 0, false, 0);
    }
}
