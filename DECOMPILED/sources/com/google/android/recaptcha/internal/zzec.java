package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p318o6.AbstractC6672k;
import p318o6.AbstractC6702z;
import p318o6.InterfaceC6698x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private InterfaceC6698x zzc = AbstractC6702z.m28298b(null, 1, null);
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (interfaceC1875e instanceof zzdv) {
            zzdvVar = (zzdv) interfaceC1875e;
            int i7 = zzdvVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, interfaceC1875e);
            }
        } else {
            zzdvVar = new zzdv(this, interfaceC1875e);
        }
        Object obj = zzdvVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzdvVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (interfaceC5367l.invoke(zzdvVar) == objE) {
                return objE;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbnVar = zzdvVar.zzd;
            AbstractC1437o.m6082b(obj);
        }
        zzbnVar.zzc();
        return AbstractC6087b.m27123d(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:26:0x0065, B:31:0x0077, B:32:0x0080), top: B:53:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzm(long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (interfaceC1875e instanceof zzdw) {
            zzdwVar = (zzdw) interfaceC1875e;
            int i7 = zzdwVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, interfaceC1875e);
            }
        } else {
            zzdwVar = new zzdw(this, interfaceC1875e);
        }
        Object objZzl = zzdwVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzdwVar.zzd;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j7;
                zzdwVar.zzd = 1;
                if (zzn(j7, zzdwVar) != objE) {
                    zzecVar = this;
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = zzdwVar.zza;
                zzecVar2 = zzdwVar.zze;
                try {
                    AbstractC1437o.m6082b(objZzl);
                    jLongValue = j7 - ((Number) objZzl).longValue();
                    if (jLongValue >= 500) {
                        return AbstractC6087b.m27123d(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e7) {
                    e = e7;
                    zzbdVar = e instanceof zzbd ? (zzbd) e : null;
                    if (zzbdVar == null) {
                        zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
                    }
                    if (AbstractC6118n.m27183a(zzecVar2.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j7 = zzdwVar.zza;
            zzecVar = zzdwVar.zze;
            AbstractC1437o.m6082b(objZzl);
            zzdy zzdyVar = new zzdy(j7, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j7;
            zzdwVar.zzd = 2;
            objZzl = zzecVar.zzl(zzdyVar, zzdwVar);
            if (objZzl != objE) {
                zzecVar2 = zzecVar;
                jLongValue = j7 - ((Number) objZzl).longValue();
                if (jLongValue >= 500) {
                    return AbstractC6087b.m27123d(jLongValue);
                }
                throw new zzbd(zzbb.zzc, zzba.zzar, null);
            }
            return objE;
        } catch (Exception e8) {
            e = e8;
            zzecVar2 = zzecVar;
            if (e instanceof zzbd) {
            }
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!AbstractC6118n.m27183a(zzecVar2.zzf, zzcm.zzd) || AbstractC6118n.m27183a(zzecVar2.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar2.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j7, InterfaceC1875e interfaceC1875e) {
        if (AbstractC6118n.m27183a(this.zzf, zzcm.zzb) || AbstractC6118n.m27183a(this.zzf, zzcm.zzc)) {
            return C1444v.f4971a;
        }
        if (AbstractC6118n.m27183a(this.zzf, zzcm.zzd) && !zzo(this.zzd)) {
            return C1444v.f4971a;
        }
        this.zzf = zzcm.zzc;
        InterfaceC6698x interfaceC6698xM28298b = AbstractC6702z.m28298b(null, 1, null);
        this.zzc = interfaceC6698xM28298b;
        AbstractC6672k.m28227d(this.zzg.zza(), null, null, new zzeb(this, interfaceC6698xM28298b, j7, null), 3, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (AbstractC6118n.m27183a(zzbdVar.zzb(), zzbb.zzd) || AbstractC6118n.m27183a(zzbdVar.zzb(), zzbb.zze) || AbstractC6118n.m27183a(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j7, InterfaceC1875e interfaceC1875e) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        String str3;
        double d7;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        String str5;
        zzec zzecVar3;
        if (interfaceC1875e instanceof zzdu) {
            zzduVar = (zzdu) interfaceC1875e;
            int i7 = zzduVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(this, interfaceC1875e);
            }
        } else {
            zzduVar = new zzdu(this, interfaceC1875e);
        }
        zzdu zzduVar2 = zzduVar;
        Object objZzm2 = zzduVar2.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzduVar2.zzd;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(objZzm2);
                zzduVar2.zze = this;
                str2 = str;
                zzduVar2.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar2.zzg = recaptchaAction2;
                zzduVar2.zzd = 1;
                objZzm = zzm(j7, zzduVar2);
                if (objZzm != objE) {
                    zzecVar = this;
                }
                return objE;
            }
            if (i8 == 1) {
                recaptchaAction2 = zzduVar2.zzg;
                String str6 = zzduVar2.zzf;
                zzecVar = zzduVar2.zze;
                AbstractC1437o.m6082b(objZzm2);
                objZzm = objZzm2;
                str2 = str6;
            } else {
                if (i8 == 2) {
                    d7 = zzduVar2.zza;
                    recaptchaAction2 = zzduVar2.zzg;
                    str3 = zzduVar2.zzf;
                    zzecVar2 = zzduVar2.zze;
                    AbstractC1437o.m6082b(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar2.zza;
                    zzscVar = zzecVar2.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzdt zzdtVar2 = zzecVar2.zza;
                    long j8 = (long) d7;
                    zzduVar2.zze = zzecVar2;
                    zzduVar2.zzf = str3;
                    zzduVar2.zzg = null;
                    zzduVar2.zzd = 3;
                    str4 = str3;
                    objZzm2 = zzdtVar2.zzm(zzspVarZzi, str4, j8, zzduVar2);
                    if (objZzm2 != objE) {
                        str5 = str4;
                        zzecVar3 = zzecVar2;
                    }
                    return objE;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = zzduVar2.zzf;
                zzecVar3 = zzduVar2.zze;
                AbstractC1437o.m6082b(objZzm2);
            }
            zzsr zzsrVar = (zzsr) objZzm2;
            zzecVar3.zza.zzq(str5, zzsrVar);
            return zzsrVar.zzj();
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar3 = zzecVar.zza;
            double d8 = 0.45d * dLongValue;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d9 = dLongValue * 0.55d;
            zzduVar2.zza = d9;
            zzduVar2.zzd = 2;
            Object objZzl = zzdtVar3.zzl(str2, (long) d8, zzduVar2);
            if (objZzl != objE) {
                zzec zzecVar4 = zzecVar;
                str3 = str2;
                objZzm2 = objZzl;
                d7 = d9;
                zzecVar2 = zzecVar4;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar4 = zzecVar2.zza;
                zzscVar = zzecVar2.zze;
                if (zzscVar == null) {
                    zzscVar = null;
                }
                zzsp zzspVarZzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                zzdt zzdtVar5 = zzecVar2.zza;
                long j9 = (long) d7;
                zzduVar2.zze = zzecVar2;
                zzduVar2.zzf = str3;
                zzduVar2.zzg = null;
                zzduVar2.zzd = 3;
                str4 = str3;
                objZzm2 = zzdtVar5.zzm(zzspVarZzi2, str4, j9, zzduVar2);
                if (objZzm2 != objE) {
                    str5 = str4;
                    zzecVar3 = zzecVar2;
                    zzsr zzsrVar2 = (zzsr) objZzm2;
                    zzecVar3.zza.zzq(str5, zzsrVar2);
                    return zzsrVar2.zzj();
                }
            }
            return objE;
        } catch (zzbd e7) {
            throw e7;
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e8.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j7, InterfaceC1875e interfaceC1875e) {
        Object objZzn = zzn(j7, interfaceC1875e);
        return objZzn == AbstractC2005b.m8369e() ? objZzn : C1444v.f4971a;
    }
}
