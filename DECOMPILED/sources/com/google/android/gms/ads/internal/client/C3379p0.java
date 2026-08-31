package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbye;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3379p0 extends zzaxz implements InterfaceC3387r0 {
    C3379p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: E0 */
    public final InterfaceC3359k0 mo17168E0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        InterfaceC3359k0 c3351i0;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(18, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3351i0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            c3351i0 = iInterfaceQueryLocalInterface instanceof InterfaceC3359k0 ? (InterfaceC3359k0) iInterfaceQueryLocalInterface : new C3351i0(strongBinder);
        }
        parcelZzde.recycle();
        return c3351i0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: H */
    public final InterfaceC3312Y mo17169H(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        InterfaceC3312Y c3306w;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3369m2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(1, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3306w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3306w = iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(strongBinder);
        }
        parcelZzde.recycle();
        return c3306w;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC3310X0 mo17170K0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        InterfaceC3310X0 c3304v0;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(17, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3304v0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c3304v0 = iInterfaceQueryLocalInterface instanceof InterfaceC3310X0 ? (InterfaceC3310X0) iInterfaceQueryLocalInterface : new C3304V0(strongBinder);
        }
        parcelZzde.recycle();
        return c3304v0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: b */
    public final zzbsp mo17171b(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(15, parcelZza);
        zzbsp zzbspVarZzb = zzbso.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbspVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: c */
    public final zzbga mo17172c(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, interfaceC3772a2);
        Parcel parcelZzde = zzde(5, parcelZza);
        zzbga zzbgaVarZzdK = zzbfz.zzdK(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbgaVarZzdK;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: f */
    public final zzbwa mo17174f(InterfaceC3772a interfaceC3772a, String str, zzbox zzboxVar, int i7) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(12, parcelZza);
        zzbwa zzbwaVarZzt = zzbvz.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbwaVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: j */
    public final InterfaceC3300U mo17175j(InterfaceC3772a interfaceC3772a, String str, zzbox zzboxVar, int i7) {
        InterfaceC3300U c3294s;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(3, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3294s = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            c3294s = iInterfaceQueryLocalInterface instanceof InterfaceC3300U ? (InterfaceC3300U) iInterfaceQueryLocalInterface : new C3294S(strongBinder);
        }
        parcelZzde.recycle();
        return c3294s;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: m */
    public final zzbye mo17176m(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(14, parcelZza);
        zzbye zzbyeVarZzb = zzbyd.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbyeVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: n */
    public final InterfaceC3312Y mo17177n(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        InterfaceC3312Y c3306w;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3369m2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(13, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3306w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3306w = iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(strongBinder);
        }
        parcelZzde.recycle();
        return c3306w;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC3312Y mo17178p0(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, int i7) {
        InterfaceC3312Y c3306w;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3369m2);
        parcelZza.writeString(str);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(10, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3306w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3306w = iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(strongBinder);
        }
        parcelZzde.recycle();
        return c3306w;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: q0 */
    public final zzbko mo17179q0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7, zzbkl zzbklVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayb.zze(parcelZza, zzbklVar);
        Parcel parcelZzde = zzde(16, parcelZza);
        zzbko zzbkoVarZzb = zzbkn.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbkoVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC3248C0 mo17181v0(InterfaceC3772a interfaceC3772a, int i7) {
        InterfaceC3248C0 c3415z0;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(9, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3415z0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c3415z0 = iInterfaceQueryLocalInterface instanceof InterfaceC3248C0 ? (InterfaceC3248C0) iInterfaceQueryLocalInterface : new C3415z0(strongBinder);
        }
        parcelZzde.recycle();
        return c3415z0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: z */
    public final InterfaceC3312Y mo17182z(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        InterfaceC3312Y c3306w;
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3369m2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzboxVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(2, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3306w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3306w = iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(strongBinder);
        }
        parcelZzde.recycle();
        return c3306w;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    public final zzbsw zzg(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        Parcel parcelZzde = zzde(8, parcelZza);
        zzbsw zzbswVarZzI = zzbsv.zzI(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbswVarZzI;
    }
}
