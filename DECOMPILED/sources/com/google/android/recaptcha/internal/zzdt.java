package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p145S5.C1436n;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p278j6.AbstractC5905g;
import p294l6.AbstractC6307h;
import p318o6.AbstractC6601B0;
import p318o6.AbstractC6603C0;
import p318o6.AbstractC6644X0;
import p318o6.AbstractC6662f;
import p318o6.AbstractC6668i;
import p318o6.C6640V0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final InterfaceC1429g zzd;
    private final InterfaceC1429g zze;
    private final InterfaceC1429g zzf;
    private final InterfaceC1429g zzg;
    private final InterfaceC1429g zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i7 = zzav.zza;
        this.zzd = AbstractC1430h.m6066b(zzdm.zza);
        this.zze = AbstractC1430h.m6066b(zzdn.zza);
        this.zzf = AbstractC1430h.m6066b(zzdo.zza);
        this.zzg = AbstractC1430h.m6066b(zzdp.zza);
        this.zzh = AbstractC1430h.m6066b(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object zzv(zzsc zzscVar, long j7, InterfaceC1875e interfaceC1875e) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        zzdt zzdtVar;
        if (interfaceC1875e instanceof zzdj) {
            zzdjVar = (zzdj) interfaceC1875e;
            int i7 = zzdjVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzdjVar = new zzdj(this, interfaceC1875e);
            }
        } else {
            zzdjVar = new zzdj(this, interfaceC1875e);
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzdjVar2.zzd;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j7, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != objE) {
                zzdtVar = this;
            }
            return objE;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) zzdjVar2.zza;
            AbstractC1437o.m6082b(obj);
            throw th;
        }
        zzdtVar = (zzdt) zzdjVar2.zza;
        AbstractC1437o.m6082b(obj);
        objZzc = ((C1436n) obj).m6080i();
        Throwable thM6075d = C1436n.m6075d(objZzc);
        if (thM6075d == null) {
            return C1444v.f4971a;
        }
        AbstractC6603C0.m27964f(zzdtVar.zzi.zzd().mo12635Q(), null, 1, null);
        List listN = AbstractC6307h.m27249n(AbstractC6601B0.m27953j(zzdtVar.zzi.zzd().mo12635Q()).getChildren());
        zzdjVar2.zza = thM6075d;
        zzdjVar2.zzd = 2;
        if (AbstractC6662f.m28177b(listN, zzdjVar2) != objE) {
            throw thM6075d;
        }
        return objE;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return AbstractC1638q.m6593g0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i7 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i7 = zzav.zza;
            ((zzfu) AbstractC1430h.m6066b(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e7.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(String str, long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzdd zzddVar;
        Exception e7;
        zzen zzenVar;
        C6640V0 e8;
        zzbd e9;
        if (interfaceC1875e instanceof zzdd) {
            zzddVar = (zzdd) interfaceC1875e;
            int i7 = zzddVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, interfaceC1875e);
            }
        } else {
            zzddVar = new zzdd(this, interfaceC1875e);
        }
        Object obj = zzddVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzddVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j7, zzddVar);
                if (objZzb == objE) {
                    return objE;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (zzbd e10) {
                e9 = e10;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e9);
                throw e9;
            } catch (C6640V0 e11) {
                e8 = e11;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e8.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (Exception e12) {
                e7 = e12;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e7.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzddVar.zzd;
            try {
                AbstractC1437o.m6082b(obj);
            } catch (zzbd e13) {
                e9 = e13;
                zzenVar.zzb(e9);
                throw e9;
            } catch (C6640V0 e14) {
                e8 = e14;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e8.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (Exception e15) {
                e7 = e15;
                zzbd zzbdVar4 = new zzbd(zzbb.zzb, zzba.zzaa, e7.getMessage());
                zzenVar.zzb(zzbdVar4);
                throw zzbdVar4;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j7, InterfaceC1875e interfaceC1875e) {
        return AbstractC6668i.m28186g(this.zzi.zza().mo12635Q(), new zzdg(this, str, j7, zzspVar, null), interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(zzsc zzscVar, long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzdk zzdkVar;
        if (interfaceC1875e instanceof zzdk) {
            zzdkVar = (zzdk) interfaceC1875e;
            int i7 = zzdkVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzdkVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzdkVar = new zzdk(this, interfaceC1875e);
            }
        } else {
            zzdkVar = new zzdk(this, interfaceC1875e);
        }
        Object obj = zzdkVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzdkVar.zzc;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j7, null);
                zzdkVar.zzc = 1;
                if (AbstractC6644X0.m28136c(j7, zzdlVar, zzdkVar) == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        } catch (zzbd e7) {
            throw e7;
        } catch (C6640V0 e8) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e9.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzo(long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzdr zzdrVar;
        Exception e7;
        zzen zzenVar;
        zzdt zzdtVar;
        C6640V0 e8;
        zzbd e9;
        if (interfaceC1875e instanceof zzdr) {
            zzdrVar = (zzdr) interfaceC1875e;
            int i7 = zzdrVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzdrVar = new zzdr(this, interfaceC1875e);
            }
        } else {
            zzdrVar = new zzdr(this, interfaceC1875e);
        }
        Object obj = zzdrVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzdrVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            zzen zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objM28136c = AbstractC6644X0.m28136c(j7, zzdsVar, zzdrVar);
                if (objM28136c == objE) {
                    return objE;
                }
                obj = objM28136c;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
            } catch (zzbd e10) {
                e9 = e10;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                if (AbstractC6118n.m27183a(e9.zzb(), zzbb.zzc)) {
                    e9 = zzdtVar.zzs(e9, e9);
                }
                zzenVar.zzb(e9);
                throw e9;
            } catch (C6640V0 e11) {
                e8 = e11;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs = zzdtVar.zzs(e8, new zzbd(zzbb.zzc, zzba.zzb, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (Exception e12) {
                e7 = e12;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e7, new zzbd(zzbb.zzc, zzba.zzaw, e7.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                AbstractC1437o.m6082b(obj);
            } catch (zzbd e13) {
                e9 = e13;
                if (AbstractC6118n.m27183a(e9.zzb(), zzbb.zzc)) {
                    e9 = zzdtVar.zzs(e9, e9);
                }
                zzenVar.zzb(e9);
                throw e9;
            } catch (C6640V0 e14) {
                e8 = e14;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e8, new zzbd(zzbb.zzc, zzba.zzb, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (Exception e15) {
                e7 = e15;
                zzbd zzbdVarZzs4 = zzdtVar.zzs(e7, new zzbd(zzbb.zzc, zzba.zzaw, e7.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            }
        }
        return (zzsc) obj;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5905g.m26654b(AbstractC1610H.m6623e(AbstractC1638q.m6774s(listZzk, 10)), 16));
            for (zzst zzstVar : listZzk) {
                C1435m c1435mM6083a = AbstractC1440r.m6083a(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(c1435mM6083a.m6070c(), c1435mM6083a.m6071d());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e7) {
            zzenVarZzf.zzb(e7);
        } catch (Exception e8) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e8.getMessage()));
        }
    }
}
