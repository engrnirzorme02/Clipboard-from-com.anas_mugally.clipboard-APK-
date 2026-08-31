package com.google.android.recaptcha.internal;

import android.app.Application;
import androidx.core.content.AbstractC2436b;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final InterfaceC7419a zzb = AbstractC7425g.m32877b(false, 1, null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        this.zza = application;
        int i7 = 1;
        this.zze = new zzl(null, i7, 0 == true ? 1 : 0);
        int i8 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(0 == true ? 1 : 0, i7, 0 == true ? 1 : 0)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i9 = 0; i9 < 13; i9++) {
            zzaw zzawVar = zzawVarArr[i9];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (AbstractC6118n.m27183a(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j7) throws zzbd {
        if (j7 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (AbstractC2436b.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return AbstractC6118n.m27183a(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j7, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, InterfaceC1875e interfaceC1875e, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i7 & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i7 & 2) != 0) {
            j7 = 10000;
        }
        return zzcvVar.zzg(str, j7, null, zzbiVar2, zzchVar2, interfaceC1875e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzj(String str, int i7, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) throws RecaptchaException {
        zzcu zzcuVar;
        Exception e7;
        zzen zzenVar;
        zzbd e8;
        if (interfaceC1875e instanceof zzcu) {
            zzcuVar = (zzcu) interfaceC1875e;
            int i8 = zzcuVar.zzc;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i8 - Integer.MIN_VALUE;
            } else {
                zzcuVar = new zzcu(this, interfaceC1875e);
            }
        } else {
            zzcuVar = new zzcu(this, interfaceC1875e);
        }
        Object objInvoke = zzcuVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i9 = zzcuVar.zzc;
        if (i9 == 0) {
            AbstractC1437o.m6082b(objInvoke);
            zzek zzekVarZzk = zzk(str, this.zzf, i7);
            zzen zzenVarZzf = zzekVarZzk.zzf(6);
            try {
                zzcuVar.zzd = zzenVarZzf;
                zzcuVar.zzc = 1;
                objInvoke = interfaceC5371p.invoke(zzekVarZzk, zzcuVar);
                if (objInvoke == objE) {
                    return objE;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e9) {
                e8 = e9;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e8);
                throw e8.zzc();
            } catch (Exception e10) {
                e7 = e10;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e7.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar.zzc();
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzcuVar.zzd;
            try {
                AbstractC1437o.m6082b(objInvoke);
            } catch (zzbd e11) {
                e8 = e11;
                zzenVar.zzb(e8);
                throw e8.zzc();
            } catch (Exception e12) {
                e7 = e12;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e7.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2.zzc();
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i7) {
        String string = UUID.randomUUID().toString();
        int i8 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) AbstractC1430h.m6066b(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i7, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zzg(String str, long j7, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, InterfaceC1875e interfaceC1875e) throws Throwable {
        zzcs zzcsVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j8;
        zzcv zzcvVar;
        String str2;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        int i7;
        if (interfaceC1875e instanceof zzcs) {
            zzcsVar = (zzcs) interfaceC1875e;
            int i8 = zzcsVar.zzg;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zzcsVar.zzg = i8 - Integer.MIN_VALUE;
            } else {
                zzcsVar = new zzcs(this, interfaceC1875e);
            }
        } else {
            zzcsVar = new zzcs(this, interfaceC1875e);
        }
        Object objZzj = zzcsVar.zze;
        Object objE = AbstractC2005b.m8369e();
        int i9 = zzcsVar.zzg;
        try {
            if (i9 == 0) {
                AbstractC1437o.m6082b(objZzj);
                InterfaceC7419a interfaceC7419a3 = this.zzb;
                zzcsVar.zza = this;
                zzcsVar.zzh = str;
                zzcsVar.zzb = null;
                zzcsVar.zzj = zzbiVar;
                zzcsVar.zzi = zzchVar;
                zzcsVar.zzc = interfaceC7419a3;
                zzcsVar.zzd = j7;
                zzcsVar.zzg = 1;
                if (interfaceC7419a3.mo32856d(null, zzcsVar) != objE) {
                    zzbiVar2 = zzbiVar;
                    zzchVar2 = zzchVar;
                    j8 = j7;
                    zzcvVar = this;
                    str2 = str;
                    interfaceC7419a = interfaceC7419a3;
                }
                return objE;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7419a2 = (InterfaceC7419a) zzcsVar.zza;
                try {
                    AbstractC1437o.m6082b(objZzj);
                    zzdc zzdcVar = (zzdc) objZzj;
                    interfaceC7419a2.mo32855c(null);
                    return zzdcVar;
                } catch (Throwable th) {
                    th = th;
                    interfaceC7419a2.mo32855c(null);
                    throw th;
                }
            }
            long j9 = zzcsVar.zzd;
            InterfaceC7419a interfaceC7419a4 = (InterfaceC7419a) zzcsVar.zzc;
            zzch zzchVar3 = zzcsVar.zzi;
            zzbi zzbiVar3 = zzcsVar.zzj;
            String str3 = zzcsVar.zzh;
            zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
            AbstractC1437o.m6082b(objZzj);
            zzchVar2 = zzchVar3;
            zzbiVar2 = zzbiVar3;
            str2 = str3;
            zzcvVar = zzcvVar2;
            j8 = j9;
            interfaceC7419a = interfaceC7419a4;
            if (AbstractC6118n.m27183a(zzchVar2, zzch.zza)) {
                i7 = 3;
            } else {
                i7 = AbstractC6118n.m27183a(zzchVar2, zzch.zzb) ? 4 : 2;
            }
            zzct zzctVar = new zzct(zzcvVar, str2, j8, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = interfaceC7419a;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            objZzj = zzcvVar.zzj(str2, i7, zzctVar, zzcsVar);
            if (objZzj != objE) {
                interfaceC7419a2 = interfaceC7419a;
                zzdc zzdcVar2 = (zzdc) objZzj;
                interfaceC7419a2.mo32855c(null);
                return zzdcVar2;
            }
            return objE;
        } catch (Throwable th2) {
            th = th2;
            interfaceC7419a2 = interfaceC7419a;
            interfaceC7419a2.mo32855c(null);
            throw th;
        }
    }
}
