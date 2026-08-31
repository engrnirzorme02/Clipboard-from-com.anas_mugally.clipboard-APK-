package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.C2400k;
import com.google.android.gms.ads.internal.client.BinderC3413y1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Collections;
import java.util.List;
import p157U3.InterfaceFutureC1673e;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdiu {
    private int zza;
    private InterfaceC3340f1 zzb;
    private zzbfp zzc;
    private View zzd;
    private List zze;
    private BinderC3413y1 zzg;
    private Bundle zzh;
    private zzcek zzi;
    private zzcek zzj;
    private zzcek zzk;
    private zzedu zzl;
    private InterfaceFutureC1673e zzm;
    private zzbzm zzn;
    private View zzo;
    private View zzp;
    private InterfaceC3772a zzq;
    private double zzr;
    private zzbfw zzs;
    private zzbfw zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final C2400k zzv = new C2400k();
    private final C2400k zzw = new C2400k();
    private List zzf = Collections.EMPTY_LIST;

    public static zzdiu zzaf(zzbpm zzbpmVar) {
        try {
            return zzak(zzam(zzbpmVar.zzn(), zzbpmVar), zzbpmVar.zzo(), (View) zzal(zzbpmVar.zzp()), zzbpmVar.zze(), zzbpmVar.zzf(), zzbpmVar.zzg(), zzbpmVar.zzs(), zzbpmVar.zzi(), (View) zzal(zzbpmVar.zzq()), zzbpmVar.zzr(), zzbpmVar.zzl(), zzbpmVar.zzm(), zzbpmVar.zzk(), zzbpmVar.zzh(), zzbpmVar.zzj(), zzbpmVar.zzz());
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to get native ad assets from unified ad mapper", e7);
            return null;
        }
    }

    public static zzdiu zzag(zzbpj zzbpjVar) {
        try {
            zzdit zzditVarZzam = zzam(zzbpjVar.zzs(), null);
            zzbfp zzbfpVarZzt = zzbpjVar.zzt();
            View view = (View) zzal(zzbpjVar.zzr());
            String strZze = zzbpjVar.zze();
            List listZzf = zzbpjVar.zzf();
            String strZzg = zzbpjVar.zzg();
            Bundle bundleZzp = zzbpjVar.zzp();
            String strZzi = zzbpjVar.zzi();
            View view2 = (View) zzal(zzbpjVar.zzu());
            InterfaceC3772a interfaceC3772aZzv = zzbpjVar.zzv();
            String strZzj = zzbpjVar.zzj();
            zzbfw zzbfwVarZzh = zzbpjVar.zzh();
            zzdiu zzdiuVar = new zzdiu();
            zzdiuVar.zza = 1;
            zzdiuVar.zzb = zzditVarZzam;
            zzdiuVar.zzc = zzbfpVarZzt;
            zzdiuVar.zzd = view;
            zzdiuVar.zzs("headline", strZze);
            zzdiuVar.zze = listZzf;
            zzdiuVar.zzs("body", strZzg);
            zzdiuVar.zzh = bundleZzp;
            zzdiuVar.zzs("call_to_action", strZzi);
            zzdiuVar.zzo = view2;
            zzdiuVar.zzq = interfaceC3772aZzv;
            zzdiuVar.zzs("advertiser", strZzj);
            zzdiuVar.zzt = zzbfwVarZzh;
            return zzdiuVar;
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to get native ad from content ad mapper", e7);
            return null;
        }
    }

    public static zzdiu zzah(zzbpi zzbpiVar) {
        try {
            zzdit zzditVarZzam = zzam(zzbpiVar.zzt(), null);
            zzbfp zzbfpVarZzv = zzbpiVar.zzv();
            View view = (View) zzal(zzbpiVar.zzu());
            String strZze = zzbpiVar.zze();
            List listZzf = zzbpiVar.zzf();
            String strZzg = zzbpiVar.zzg();
            Bundle bundleZzr = zzbpiVar.zzr();
            String strZzi = zzbpiVar.zzi();
            View view2 = (View) zzal(zzbpiVar.zzw());
            InterfaceC3772a interfaceC3772aZzx = zzbpiVar.zzx();
            String strZzk = zzbpiVar.zzk();
            String strZzl = zzbpiVar.zzl();
            double dZzj = zzbpiVar.zzj();
            zzbfw zzbfwVarZzh = zzbpiVar.zzh();
            try {
                zzdiu zzdiuVar = new zzdiu();
                zzdiuVar.zza = 2;
                zzdiuVar.zzb = zzditVarZzam;
                zzdiuVar.zzc = zzbfpVarZzv;
                zzdiuVar.zzd = view;
                zzdiuVar.zzs("headline", strZze);
                zzdiuVar.zze = listZzf;
                zzdiuVar.zzs("body", strZzg);
                zzdiuVar.zzh = bundleZzr;
                zzdiuVar.zzs("call_to_action", strZzi);
                zzdiuVar.zzo = view2;
                zzdiuVar.zzq = interfaceC3772aZzx;
                zzdiuVar.zzs("store", strZzk);
                zzdiuVar.zzs("price", strZzl);
                zzdiuVar.zzr = dZzj;
                zzdiuVar.zzs = zzbfwVarZzh;
                return zzdiuVar;
            } catch (RemoteException e7) {
                e = e7;
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e8) {
            e = e8;
        }
    }

    public static zzdiu zzai(zzbpi zzbpiVar) {
        try {
            return zzak(zzam(zzbpiVar.zzt(), null), zzbpiVar.zzv(), (View) zzal(zzbpiVar.zzu()), zzbpiVar.zze(), zzbpiVar.zzf(), zzbpiVar.zzg(), zzbpiVar.zzr(), zzbpiVar.zzi(), (View) zzal(zzbpiVar.zzw()), zzbpiVar.zzx(), zzbpiVar.zzk(), zzbpiVar.zzl(), zzbpiVar.zzj(), zzbpiVar.zzh(), null, 0.0f);
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to get native ad assets from app install ad mapper", e7);
            return null;
        }
    }

    public static zzdiu zzaj(zzbpj zzbpjVar) {
        try {
            return zzak(zzam(zzbpjVar.zzs(), null), zzbpjVar.zzt(), (View) zzal(zzbpjVar.zzr()), zzbpjVar.zze(), zzbpjVar.zzf(), zzbpjVar.zzg(), zzbpjVar.zzp(), zzbpjVar.zzi(), (View) zzal(zzbpjVar.zzu()), zzbpjVar.zzv(), null, null, -1.0d, zzbpjVar.zzh(), zzbpjVar.zzj(), 0.0f);
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to get native ad assets from content ad mapper", e7);
            return null;
        }
    }

    private static zzdiu zzak(InterfaceC3340f1 interfaceC3340f1, zzbfp zzbfpVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC3772a interfaceC3772a, String str4, String str5, double d7, zzbfw zzbfwVar, String str6, float f7) {
        zzdiu zzdiuVar = new zzdiu();
        zzdiuVar.zza = 6;
        zzdiuVar.zzb = interfaceC3340f1;
        zzdiuVar.zzc = zzbfpVar;
        zzdiuVar.zzd = view;
        zzdiuVar.zzs("headline", str);
        zzdiuVar.zze = list;
        zzdiuVar.zzs("body", str2);
        zzdiuVar.zzh = bundle;
        zzdiuVar.zzs("call_to_action", str3);
        zzdiuVar.zzo = view2;
        zzdiuVar.zzq = interfaceC3772a;
        zzdiuVar.zzs("store", str4);
        zzdiuVar.zzs("price", str5);
        zzdiuVar.zzr = d7;
        zzdiuVar.zzs = zzbfwVar;
        zzdiuVar.zzs("advertiser", str6);
        zzdiuVar.zzu(f7);
        return zzdiuVar;
    }

    private static Object zzal(InterfaceC3772a interfaceC3772a) {
        if (interfaceC3772a == null) {
            return null;
        }
        return BinderC3773b.m18220M0(interfaceC3772a);
    }

    private static zzdit zzam(InterfaceC3340f1 interfaceC3340f1, zzbpm zzbpmVar) {
        if (interfaceC3340f1 == null) {
            return null;
        }
        return new zzdit(interfaceC3340f1, zzbpmVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbfw zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbfv.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized BinderC3413y1 zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized InterfaceC3772a zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw("store");
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbfw zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    public final synchronized zzbfw zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzcek zzT() {
        return this.zzi;
    }

    public final synchronized zzcek zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzcek zzW() {
        return this.zzk;
    }

    public final synchronized InterfaceFutureC1673e zzX() {
        return this.zzm;
    }

    public final synchronized zzbzm zzY() {
        return this.zzn;
    }

    public final synchronized zzedu zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i7) {
        this.zza = i7;
    }

    public final synchronized C2400k zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized C2400k zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzcek zzcekVar = this.zzi;
            if (zzcekVar != null) {
                zzcekVar.destroy();
                this.zzi = null;
            }
            zzcek zzcekVar2 = this.zzj;
            if (zzcekVar2 != null) {
                zzcekVar2.destroy();
                this.zzj = null;
            }
            zzcek zzcekVar3 = this.zzk;
            if (zzcekVar3 != null) {
                zzcekVar3.destroy();
                this.zzk = null;
            }
            InterfaceFutureC1673e interfaceFutureC1673e = this.zzm;
            if (interfaceFutureC1673e != null) {
                interfaceFutureC1673e.cancel(false);
                this.zzm = null;
            }
            zzbzm zzbzmVar = this.zzn;
            if (zzbzmVar != null) {
                zzbzmVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(InterfaceC3340f1 interfaceC3340f1) {
        this.zzb = interfaceC3340f1;
    }

    public final synchronized void zzc(zzbfp zzbfpVar) {
        this.zzc = zzbfpVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(BinderC3413y1 binderC3413y1) {
        this.zzg = binderC3413y1;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d7) {
        this.zzr = d7;
    }

    public final synchronized void zzj(zzbfw zzbfwVar) {
        this.zzs = zzbfwVar;
    }

    public final synchronized void zzk(zzbfw zzbfwVar) {
        this.zzt = zzbfwVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcek zzcekVar) {
        this.zzi = zzcekVar;
    }

    public final synchronized void zzn(zzcek zzcekVar) {
        this.zzj = zzcekVar;
    }

    public final synchronized void zzo(zzcek zzcekVar) {
        this.zzk = zzcekVar;
    }

    public final synchronized void zzp(InterfaceFutureC1673e interfaceFutureC1673e) {
        this.zzm = interfaceFutureC1673e;
    }

    public final synchronized void zzq(zzedu zzeduVar) {
        this.zzl = zzeduVar;
    }

    public final synchronized void zzr(zzbzm zzbzmVar) {
        this.zzn = zzbzmVar;
    }

    public final synchronized void zzs(String str, String str2) {
        try {
            if (str2 == null) {
                this.zzw.remove(str);
            } else {
                this.zzw.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzt(String str, zzbfh zzbfhVar) {
        try {
            if (zzbfhVar == null) {
                this.zzv.remove(str);
            } else {
                this.zzv.put(str, zzbfhVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzu(float f7) {
        this.zzx = f7;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized InterfaceC3340f1 zzy() {
        return this.zzb;
    }

    public final synchronized zzbfp zzz() {
        return this.zzc;
    }
}
