package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p174X.InterfaceC1905i;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftd implements zzfrw {
    private final InterfaceC6624N zza;
    private final InterfaceC7419a zzb;
    private final InterfaceC7419a zzc;
    private final InterfaceC7419a zzd;
    private boolean zze;
    private zzfru zzf;
    private boolean zzg;
    private final InterfaceC1905i zzh;
    private final zzdpw zzi;

    public zzftd(InterfaceC1905i adQualityDataStore, zzftf coroutineScopeProvider, zzdpw dataPinger, zzfsf clock) {
        AbstractC6118n.m27187e(adQualityDataStore, "adQualityDataStore");
        AbstractC6118n.m27187e(coroutineScopeProvider, "coroutineScopeProvider");
        AbstractC6118n.m27187e(dataPinger, "dataPinger");
        AbstractC6118n.m27187e(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = AbstractC7425g.m32877b(false, 1, null);
        this.zzc = AbstractC7425g.m32877b(false, 1, null);
        this.zzd = AbstractC7425g.m32877b(false, 1, null);
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzs(String str, InterfaceC1875e interfaceC1875e) throws Throwable {
        zzfsi zzfsiVar;
        InterfaceC7419a interfaceC7419a;
        Throwable th;
        InterfaceC7419a interfaceC7419a2;
        if (interfaceC1875e instanceof zzfsi) {
            zzfsiVar = (zzfsi) interfaceC1875e;
            int i7 = zzfsiVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfsiVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfsiVar = new zzfsi(this, interfaceC1875e);
            }
        } else {
            zzfsiVar = new zzfsi(this, interfaceC1875e);
        }
        Object obj = zzfsiVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfsiVar.zze;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.zzd;
                zzfsiVar.zza = str;
                zzfsiVar.zzb = interfaceC7419a;
                zzfsiVar.zze = 1;
                if (interfaceC7419a.mo32856d(null, zzfsiVar) != objE) {
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7419a2 = (InterfaceC7419a) zzfsiVar.zza;
                try {
                    AbstractC1437o.m6082b(obj);
                    interfaceC7419a2.mo32855c(null);
                    return C1444v.f4971a;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC7419a2.mo32855c(null);
                    throw th;
                }
            }
            InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) zzfsiVar.zzb;
            String str2 = (String) zzfsiVar.zza;
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = interfaceC7419a3;
            str = str2;
            InterfaceC1905i interfaceC1905i = this.zzh;
            zzfsj zzfsjVar = new zzfsj(str, null);
            zzfsiVar.zza = interfaceC7419a;
            zzfsiVar.zzb = null;
            zzfsiVar.zze = 2;
            Object objMo7850a = interfaceC1905i.mo7850a(zzfsjVar, zzfsiVar);
            if (objMo7850a != objE) {
                InterfaceC7419a interfaceC7419a4 = interfaceC7419a;
                obj = objMo7850a;
                interfaceC7419a2 = interfaceC7419a4;
                interfaceC7419a2.mo32855c(null);
                return C1444v.f4971a;
            }
            return objE;
        } catch (Throwable th3) {
            InterfaceC7419a interfaceC7419a5 = interfaceC7419a;
            th = th3;
            interfaceC7419a2 = interfaceC7419a5;
            interfaceC7419a2.mo32855c(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(InterfaceC1875e interfaceC1875e) throws Throwable {
        zzfsl zzfslVar;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        Throwable th;
        if (interfaceC1875e instanceof zzfsl) {
            zzfslVar = (zzfsl) interfaceC1875e;
            int i7 = zzfslVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfslVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzfslVar = new zzfsl(this, interfaceC1875e);
            }
        } else {
            zzfslVar = new zzfsl(this, interfaceC1875e);
        }
        Object obj = zzfslVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfslVar.zzd;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.zzd;
                zzfslVar.zza = interfaceC7419a;
                zzfslVar.zzd = 1;
                if (interfaceC7419a.mo32856d(null, zzfslVar) != objE) {
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7419a2 = (InterfaceC7419a) zzfslVar.zza;
                try {
                    AbstractC1437o.m6082b(obj);
                    interfaceC7419a2.mo32855c(null);
                    return C1444v.f4971a;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC7419a2.mo32855c(null);
                    throw th;
                }
            }
            InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) zzfslVar.zza;
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = interfaceC7419a3;
            InterfaceC1905i interfaceC1905i = this.zzh;
            zzfsm zzfsmVar = new zzfsm(null);
            zzfslVar.zza = interfaceC7419a;
            zzfslVar.zzd = 2;
            Object objMo7850a = interfaceC1905i.mo7850a(zzfsmVar, zzfslVar);
            if (objMo7850a != objE) {
                interfaceC7419a2 = interfaceC7419a;
                obj = objMo7850a;
                interfaceC7419a2.mo32855c(null);
                return C1444v.f4971a;
            }
            return objE;
        } catch (Throwable th3) {
            interfaceC7419a2 = interfaceC7419a;
            th = th3;
            interfaceC7419a2.mo32855c(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzu(long j7, InterfaceC1875e interfaceC1875e) {
        zzfsk zzfskVar;
        InterfaceC7419a interfaceC7419a;
        if (interfaceC1875e instanceof zzfsk) {
            zzfskVar = (zzfsk) interfaceC1875e;
            int i7 = zzfskVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfskVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfskVar = new zzfsk(this, interfaceC1875e);
            }
        } else {
            zzfskVar = new zzfsk(this, interfaceC1875e);
        }
        Object obj = zzfskVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfskVar.zze;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            InterfaceC7419a interfaceC7419a2 = this.zzb;
            zzfskVar.zzb = interfaceC7419a2;
            zzfskVar.zza = j7;
            zzfskVar.zze = 1;
            if (interfaceC7419a2.mo32856d(null, zzfskVar) == objE) {
                return objE;
            }
            interfaceC7419a = interfaceC7419a2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = zzfskVar.zza;
            interfaceC7419a = (InterfaceC7419a) zzfskVar.zzb;
            AbstractC1437o.m6082b(obj);
        }
        try {
            zzfru zzfruVar = this.zzf;
            if (zzfruVar == null) {
                AbstractC6118n.m27197o("adQualityDataBuilder");
                zzfruVar = null;
            }
            zzfru zzfruVar2 = this.zzf;
            if (zzfruVar2 == null) {
                AbstractC6118n.m27197o("adQualityDataBuilder");
                zzfruVar2 = null;
            }
            long jZzi = j7 - zzfruVar2.zzi();
            zzfru zzfruVar3 = this.zzf;
            if (zzfruVar3 == null) {
                AbstractC6118n.m27197o("adQualityDataBuilder");
                zzfruVar3 = null;
            }
            zzfruVar.zzb(jZzi - zzfruVar3.zzg());
            return C1444v.f4971a;
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(InterfaceC1875e interfaceC1875e) throws Throwable {
        zzfsp zzfspVar;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        zzfrv zzfrvVar;
        InterfaceC7419a interfaceC7419a3;
        if (interfaceC1875e instanceof zzfsp) {
            zzfspVar = (zzfsp) interfaceC1875e;
            int i7 = zzfspVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfspVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfspVar = new zzfsp(this, interfaceC1875e);
            }
        } else {
            zzfspVar = new zzfsp(this, interfaceC1875e);
        }
        Object objMo7850a = zzfspVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfspVar.zze;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(objMo7850a);
                interfaceC7419a = this.zzb;
                zzfspVar.zza = interfaceC7419a;
                zzfspVar.zze = 1;
                if (interfaceC7419a.mo32856d(null, zzfspVar) != objE) {
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC7419a3 = (InterfaceC7419a) zzfspVar.zza;
                    try {
                        AbstractC1437o.m6082b(objMo7850a);
                        interfaceC7419a3.mo32855c(null);
                        return C1444v.f4971a;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC7419a3.mo32855c(null);
                        throw th;
                    }
                }
                interfaceC7419a2 = (InterfaceC7419a) zzfspVar.zzb;
                zzfrvVar = (zzfrv) zzfspVar.zza;
                AbstractC1437o.m6082b(objMo7850a);
                try {
                    InterfaceC1905i interfaceC1905i = this.zzh;
                    zzfsq zzfsqVar = new zzfsq(zzfrvVar, null);
                    zzfspVar.zza = interfaceC7419a2;
                    zzfspVar.zzb = null;
                    zzfspVar.zze = 3;
                    objMo7850a = interfaceC1905i.mo7850a(zzfsqVar, zzfspVar);
                    if (objMo7850a != objE) {
                        interfaceC7419a3 = interfaceC7419a2;
                        interfaceC7419a3.mo32855c(null);
                        return C1444v.f4971a;
                    }
                    return objE;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC7419a3 = interfaceC7419a2;
                    interfaceC7419a3.mo32855c(null);
                    throw th;
                }
            }
            interfaceC7419a = (InterfaceC7419a) zzfspVar.zza;
            AbstractC1437o.m6082b(objMo7850a);
            zzfru zzfruVar = this.zzf;
            if (zzfruVar == null) {
                AbstractC6118n.m27197o("adQualityDataBuilder");
                zzfruVar = null;
            }
            zzfrv zzfrvVar2 = (zzfrv) zzfruVar.zzbu();
            interfaceC7419a.mo32855c(null);
            AbstractC6118n.m27184b(zzfrvVar2);
            interfaceC7419a2 = this.zzd;
            zzfspVar.zza = zzfrvVar2;
            zzfspVar.zzb = interfaceC7419a2;
            zzfspVar.zze = 2;
            if (interfaceC7419a2.mo32856d(null, zzfspVar) != objE) {
                zzfrvVar = zzfrvVar2;
                InterfaceC1905i interfaceC1905i2 = this.zzh;
                zzfsq zzfsqVar2 = new zzfsq(zzfrvVar, null);
                zzfspVar.zza = interfaceC7419a2;
                zzfspVar.zzb = null;
                zzfspVar.zze = 3;
                objMo7850a = interfaceC1905i2.mo7850a(zzfsqVar2, zzfspVar);
                if (objMo7850a != objE) {
                    interfaceC7419a3 = interfaceC7419a2;
                    interfaceC7419a3.mo32855c(null);
                    return C1444v.f4971a;
                }
            }
            return objE;
        } catch (Throwable th3) {
            interfaceC7419a.mo32855c(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private static final boolean zzw(zzfrv zzfrvVar) {
        boolean z7;
        List listZzk = zzfrvVar.zzk();
        Long l7 = listZzk != null ? (Long) AbstractC1638q.m6580T(listZzk) : null;
        boolean z8 = zzfrvVar.zzl() > zzfrvVar.zzm() && !zzfrvVar.zzd();
        if (l7 != null) {
            if (zzfrvVar.zzi() - l7.longValue() > 5000) {
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        return z8 || z7;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zza() {
        AbstractC6672k.m28227d(this.zza, null, null, new zzfsy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzb(String gwsQueryId) {
        AbstractC6118n.m27187e(gwsQueryId, "gwsQueryId");
        AbstractC6672k.m28227d(this.zza, null, null, new zzfss(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzc() {
        AbstractC6672k.m28227d(this.zza, null, null, new zzfso(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzd() {
        AbstractC6672k.m28227d(this.zza, null, null, new zzftc(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zze() {
        AbstractC6672k.m28227d(this.zza, null, null, new zzfsw(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzf() {
        AbstractC6672k.m28227d(this.zza, null, null, new zzfta(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzg() {
        AbstractC6672k.m28227d(this.zza, null, null, new zzfsu(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [x6.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [x6.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzftd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(InterfaceC1875e interfaceC1875e) {
        zzfsx zzfsxVar;
        InterfaceC7419a interfaceC7419a;
        zzfrz zzfrzVar;
        if (interfaceC1875e instanceof zzfsx) {
            zzfsxVar = (zzfsx) interfaceC1875e;
            int i7 = zzfsxVar.zzd;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfsxVar.zzd = i7 - Integer.MIN_VALUE;
            } else {
                zzfsxVar = new zzfsx(this, interfaceC1875e);
            }
        } else {
            zzfsxVar = new zzfsx(this, interfaceC1875e);
        }
        Object objM30366l = zzfsxVar.zzb;
        Object objE = AbstractC2005b.m8369e();
        ?? r7 = zzfsxVar.zzd;
        try {
            if (r7 == 0) {
                AbstractC1437o.m6082b(objM30366l);
                InterfaceC7419a interfaceC7419a2 = this.zzd;
                zzfsxVar.zza = interfaceC7419a2;
                zzfsxVar.zzd = 1;
                if (interfaceC7419a2.mo32856d(null, zzfsxVar) != objE) {
                    interfaceC7419a = interfaceC7419a2;
                }
                return objE;
            }
            if (r7 == 1) {
                InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) zzfsxVar.zza;
                AbstractC1437o.m6082b(objM30366l);
                interfaceC7419a = interfaceC7419a3;
            } else if (r7 == 2) {
                InterfaceC7419a interfaceC7419a4 = (InterfaceC7419a) zzfsxVar.zza;
                AbstractC1437o.m6082b(objM30366l);
                r7 = interfaceC7419a4;
                zzfrzVar = (zzfrz) objM30366l;
                r7.mo32855c(null);
                if (zzfrzVar != null || zzfrzVar.zza() == 0) {
                    return C1444v.f4971a;
                }
                for (Map.Entry entry : zzfrzVar.zzb().entrySet()) {
                    zzhib zzhibVarZzcc = ((zzfrv) entry.getValue()).zzcc();
                    AbstractC6118n.m27186d(zzhibVarZzcc, "toBuilder(...)");
                    zzfru zzfruVar = (zzfru) zzhibVarZzcc;
                    Object value = entry.getValue();
                    AbstractC6118n.m27186d(value, "<get-value>(...)");
                    if (zzw((zzfrv) value)) {
                        zzfruVar.zzf(true);
                    }
                    zzdpw zzdpwVar = this.zzi;
                    zzhih zzhihVarZzbu = zzfruVar.zzbu();
                    AbstractC6118n.m27186d(zzhihVarZzbu, "build(...)");
                    zzdpwVar.zza((zzfrv) zzhihVarZzbu);
                }
                zzfsxVar.zza = null;
                zzfsxVar.zzd = 3;
            } else {
                if (r7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(objM30366l);
            }
            return C1444v.f4971a;
            InterfaceC6918c data = this.zzh.getData();
            zzfsxVar.zza = interfaceC7419a;
            zzfsxVar.zzd = 2;
            objM30366l = AbstractC6920e.m30366l(data, zzfsxVar);
            r7 = interfaceC7419a;
            if (objM30366l != objE) {
                zzfrzVar = (zzfrz) objM30366l;
                r7.mo32855c(null);
                if (zzfrzVar != null) {
                }
                return C1444v.f4971a;
            }
            return objE;
        } catch (Throwable th) {
            r7.mo32855c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(String str, InterfaceC1875e interfaceC1875e) {
        zzfsr zzfsrVar;
        String str2;
        InterfaceC7419a interfaceC7419a;
        long j7;
        if (interfaceC1875e instanceof zzfsr) {
            zzfsrVar = (zzfsr) interfaceC1875e;
            int i7 = zzfsrVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfsrVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfsrVar = new zzfsr(this, interfaceC1875e);
            }
        } else {
            zzfsrVar = new zzfsr(this, interfaceC1875e);
        }
        Object obj = zzfsrVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfsrVar.zze;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            InterfaceC7419a interfaceC7419a2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfsrVar.zzf = str;
            zzfsrVar.zza = interfaceC7419a2;
            zzfsrVar.zzb = jCurrentTimeMillis;
            zzfsrVar.zze = 1;
            if (interfaceC7419a2.mo32856d(null, zzfsrVar) == objE) {
                return objE;
            }
            str2 = str;
            interfaceC7419a = interfaceC7419a2;
            j7 = jCurrentTimeMillis;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = zzfsrVar.zzb;
            interfaceC7419a = (InterfaceC7419a) zzfsrVar.zza;
            str2 = zzfsrVar.zzf;
            AbstractC1437o.m6082b(obj);
        }
        try {
            if (this.zze) {
                return C1444v.f4971a;
            }
            this.zze = true;
            zzfru zzfruVar = (zzfru) zzfrv.zzp().zzcc();
            this.zzf = zzfruVar;
            if (zzfruVar == null) {
                AbstractC6118n.m27197o("adQualityDataBuilder");
                zzfruVar = null;
            }
            zzfruVar.zza(str2);
            zzfruVar.zzj(j7);
            return C1444v.f4971a;
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x0087, B:35:0x008b, B:38:0x0094), top: B:51:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (zzv(r0) == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(InterfaceC1875e interfaceC1875e) {
        zzfsn zzfsnVar;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        long j7;
        zzfru zzfruVar;
        if (interfaceC1875e instanceof zzfsn) {
            zzfsnVar = (zzfsn) interfaceC1875e;
            int i7 = zzfsnVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfsnVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfsnVar = new zzfsn(this, interfaceC1875e);
            }
        } else {
            zzfsnVar = new zzfsn(this, interfaceC1875e);
        }
        Object obj = zzfsnVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfsnVar.zze;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.zzc;
                zzfsnVar.zza = interfaceC7419a;
                zzfsnVar.zze = 1;
                if (interfaceC7419a.mo32856d(null, zzfsnVar) != objE) {
                }
                return objE;
            }
            if (i8 == 1) {
                interfaceC7419a = (InterfaceC7419a) zzfsnVar.zza;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 == 2) {
                    j7 = zzfsnVar.zzb;
                    interfaceC7419a2 = (InterfaceC7419a) zzfsnVar.zza;
                    AbstractC1437o.m6082b(obj);
                    try {
                        zzfruVar = this.zzf;
                        if (zzfruVar == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar = null;
                        }
                        zzfruVar.zzo(j7);
                        interfaceC7419a2.mo32855c(null);
                        zzfsnVar.zza = null;
                        zzfsnVar.zze = 3;
                        if (zzu(j7, zzfsnVar) != objE) {
                            zzfsnVar.zze = 4;
                        }
                        return objE;
                    } catch (Throwable th) {
                        interfaceC7419a2.mo32855c(null);
                        throw th;
                    }
                }
                if (i8 == 3) {
                    AbstractC1437o.m6082b(obj);
                    zzfsnVar.zze = 4;
                } else {
                    if (i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            }
            return C1444v.f4971a;
            if (this.zzg) {
                C1444v c1444v = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v;
            }
            this.zzg = true;
            C1444v c1444v2 = C1444v.f4971a;
            interfaceC7419a.mo32855c(null);
            interfaceC7419a2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfsnVar.zza = interfaceC7419a2;
            zzfsnVar.zzb = jCurrentTimeMillis;
            zzfsnVar.zze = 2;
            if (interfaceC7419a2.mo32856d(null, zzfsnVar) != objE) {
                j7 = jCurrentTimeMillis;
                zzfruVar = this.zzf;
                if (zzfruVar == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar = null;
                }
                zzfruVar.zzo(j7);
                interfaceC7419a2.mo32855c(null);
                zzfsnVar.zza = null;
                zzfsnVar.zze = 3;
                if (zzu(j7, zzfsnVar) != objE) {
                    zzfsnVar.zze = 4;
                }
            }
            return objE;
        } catch (Throwable th2) {
            interfaceC7419a.mo32855c(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzk(InterfaceC1875e interfaceC1875e) {
        zzftb zzftbVar;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        long j7;
        zzfru zzfruVar;
        zzfru zzfruVar2;
        zzfru zzfruVar3;
        zzfru zzfruVar4;
        zzfru zzfruVar5;
        zzfru zzfruVar6;
        long jLongValue;
        zzfru zzfruVar7;
        zzfru zzfruVar8;
        if (interfaceC1875e instanceof zzftb) {
            zzftbVar = (zzftb) interfaceC1875e;
            int i7 = zzftbVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzftbVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzftbVar = new zzftb(this, interfaceC1875e);
            }
        } else {
            zzftbVar = new zzftb(this, interfaceC1875e);
        }
        Object obj = zzftbVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzftbVar.zze;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.zzc;
                zzftbVar.zza = interfaceC7419a;
                zzftbVar.zze = 1;
                if (interfaceC7419a.mo32856d(null, zzftbVar) != objE) {
                }
                return objE;
            }
            if (i8 == 1) {
                interfaceC7419a = (InterfaceC7419a) zzftbVar.zza;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = zzftbVar.zzb;
                interfaceC7419a2 = (InterfaceC7419a) zzftbVar.zza;
                AbstractC1437o.m6082b(obj);
            }
            try {
                zzfruVar = this.zzf;
                if (zzfruVar == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar = null;
                }
                if (zzfruVar.zzr() > 0) {
                    zzfruVar6 = this.zzf;
                    if (zzfruVar6 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar6 = null;
                    }
                    List listZzq = zzfruVar6.zzq();
                    AbstractC6118n.m27186d(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objS = AbstractC1638q.m6579S(listZzq);
                    AbstractC6118n.m27186d(objS, "last(...)");
                    jLongValue = j7 - ((Number) objS).longValue();
                    zzfruVar7 = this.zzf;
                    if (zzfruVar7 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar7 = null;
                    }
                    zzfruVar7.zzt();
                    if (jLongValue < 5000) {
                        zzfruVar8 = this.zzf;
                        if (zzfruVar8 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar8 = null;
                        }
                        zzfruVar8.zzd(zzfruVar8.zzc() + 1);
                    }
                }
                zzfruVar2 = this.zzf;
                if (zzfruVar2 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar2 = null;
                }
                if (zzfruVar2.zzn() > 0) {
                    zzfruVar4 = this.zzf;
                    if (zzfruVar4 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar4 = null;
                    }
                    List listZzm = zzfruVar4.zzm();
                    AbstractC6118n.m27186d(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objS2 = AbstractC1638q.m6579S(listZzm);
                    AbstractC6118n.m27186d(objS2, "last(...)");
                    long jLongValue2 = j7 - ((Number) objS2).longValue();
                    zzfruVar5 = this.zzf;
                    if (zzfruVar5 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar5 = null;
                    }
                    zzfruVar5.zzh(zzfruVar5.zzg() + jLongValue2);
                }
                zzfruVar3 = this.zzf;
                if (zzfruVar3 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar3 = null;
                }
                zzfruVar3.zzp(j7);
                return C1444v.f4971a;
            } finally {
                interfaceC7419a2.mo32855c(null);
            }
            if (!this.zzg) {
                C1444v c1444v = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v;
            }
            this.zzg = false;
            C1444v c1444v2 = C1444v.f4971a;
            interfaceC7419a.mo32855c(null);
            InterfaceC7419a interfaceC7419a3 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzftbVar.zza = interfaceC7419a3;
            zzftbVar.zzb = jCurrentTimeMillis;
            zzftbVar.zze = 2;
            if (interfaceC7419a3.mo32856d(null, zzftbVar) != objE) {
                interfaceC7419a2 = interfaceC7419a3;
                j7 = jCurrentTimeMillis;
                zzfruVar = this.zzf;
                if (zzfruVar == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar = null;
                }
                if (zzfruVar.zzr() > 0) {
                    zzfruVar6 = this.zzf;
                    if (zzfruVar6 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar6 = null;
                    }
                    List listZzq2 = zzfruVar6.zzq();
                    AbstractC6118n.m27186d(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objS3 = AbstractC1638q.m6579S(listZzq2);
                    AbstractC6118n.m27186d(objS3, "last(...)");
                    jLongValue = j7 - ((Number) objS3).longValue();
                    zzfruVar7 = this.zzf;
                    if (zzfruVar7 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar7 = null;
                    }
                    zzfruVar7.zzt();
                    if (jLongValue < 5000) {
                        zzfruVar8 = this.zzf;
                        if (zzfruVar8 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar8 = null;
                        }
                        zzfruVar8.zzd(zzfruVar8.zzc() + 1);
                    }
                }
                zzfruVar2 = this.zzf;
                if (zzfruVar2 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar2 = null;
                }
                if (zzfruVar2.zzn() > 0) {
                    zzfruVar4 = this.zzf;
                    if (zzfruVar4 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar4 = null;
                    }
                    List listZzm2 = zzfruVar4.zzm();
                    AbstractC6118n.m27186d(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objS4 = AbstractC1638q.m6579S(listZzm2);
                    AbstractC6118n.m27186d(objS4, "last(...)");
                    long jLongValue3 = j7 - ((Number) objS4).longValue();
                    zzfruVar5 = this.zzf;
                    if (zzfruVar5 == null) {
                        AbstractC6118n.m27197o("adQualityDataBuilder");
                        zzfruVar5 = null;
                    }
                    zzfruVar5.zzh(zzfruVar5.zzg() + jLongValue3);
                }
                zzfruVar3 = this.zzf;
                if (zzfruVar3 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar3 = null;
                }
                zzfruVar3.zzp(j7);
                return C1444v.f4971a;
            }
            return objE;
        } catch (Throwable th) {
            interfaceC7419a.mo32855c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        if (zzs(r14, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(InterfaceC1875e interfaceC1875e) {
        zzfsv zzfsvVar;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        long j7;
        zzfru zzfruVar;
        zzfru zzfruVar2;
        zzfru zzfruVar3;
        zzfru zzfruVar4;
        zzfru zzfruVar5;
        zzfrv zzfrvVar;
        zzfrv zzfrvVar2;
        if (interfaceC1875e instanceof zzfsv) {
            zzfsvVar = (zzfsv) interfaceC1875e;
            int i7 = zzfsvVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfsvVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfsvVar = new zzfsv(this, interfaceC1875e);
            }
        } else {
            zzfsvVar = new zzfsv(this, interfaceC1875e);
        }
        Object obj = zzfsvVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfsvVar.zze;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.zzb;
                zzfsvVar.zza = interfaceC7419a;
                zzfsvVar.zze = 1;
                if (interfaceC7419a.mo32856d(null, zzfsvVar) != objE) {
                }
                return objE;
            }
            if (i8 == 1) {
                interfaceC7419a = (InterfaceC7419a) zzfsvVar.zza;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 == 2) {
                    j7 = zzfsvVar.zzb;
                    interfaceC7419a2 = (InterfaceC7419a) zzfsvVar.zza;
                    AbstractC1437o.m6082b(obj);
                    try {
                        zzfruVar = this.zzf;
                        if (zzfruVar == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar = null;
                        }
                        zzfruVar2 = this.zzf;
                        if (zzfruVar2 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar2 = null;
                        }
                        long jZzi = j7 - zzfruVar2.zzi();
                        zzfruVar3 = this.zzf;
                        if (zzfruVar3 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar3 = null;
                        }
                        zzfruVar.zzb(jZzi - zzfruVar3.zzg());
                        zzfruVar4 = this.zzf;
                        if (zzfruVar4 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar4 = null;
                        }
                        zzfruVar4.zzl(j7);
                        zzfruVar5 = this.zzf;
                        if (zzfruVar5 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar5 = null;
                        }
                        zzfrvVar = (zzfrv) zzfruVar5.zzbu();
                        interfaceC7419a2.mo32855c(null);
                        AbstractC6118n.m27184b(zzfrvVar);
                        zzfsvVar.zza = zzfrvVar;
                        zzfsvVar.zze = 3;
                        if (zzv(zzfsvVar) != objE) {
                            zzfrvVar2 = zzfrvVar;
                            if (this.zzi.zza(zzfrvVar2)) {
                                String strZza = zzfrvVar2.zza();
                                AbstractC6118n.m27186d(strZza, "getGwsQueryId(...)");
                                zzfsvVar.zza = null;
                                zzfsvVar.zze = 4;
                            }
                        }
                        return objE;
                    } catch (Throwable th) {
                        interfaceC7419a2.mo32855c(null);
                        throw th;
                    }
                }
                if (i8 == 3) {
                    zzfrvVar2 = (zzfrv) zzfsvVar.zza;
                    AbstractC1437o.m6082b(obj);
                    if (this.zzi.zza(zzfrvVar2)) {
                        String strZza2 = zzfrvVar2.zza();
                        AbstractC6118n.m27186d(strZza2, "getGwsQueryId(...)");
                        zzfsvVar.zza = null;
                        zzfsvVar.zze = 4;
                    }
                } else {
                    if (i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            }
            return C1444v.f4971a;
            if (!this.zze) {
                C1444v c1444v = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v;
            }
            this.zze = false;
            C1444v c1444v2 = C1444v.f4971a;
            interfaceC7419a.mo32855c(null);
            interfaceC7419a2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfsvVar.zza = interfaceC7419a2;
            zzfsvVar.zzb = jCurrentTimeMillis;
            zzfsvVar.zze = 2;
            if (interfaceC7419a2.mo32856d(null, zzfsvVar) != objE) {
                j7 = jCurrentTimeMillis;
                zzfruVar = this.zzf;
                if (zzfruVar == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar = null;
                }
                zzfruVar2 = this.zzf;
                if (zzfruVar2 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar2 = null;
                }
                long jZzi2 = j7 - zzfruVar2.zzi();
                zzfruVar3 = this.zzf;
                if (zzfruVar3 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar3 = null;
                }
                zzfruVar.zzb(jZzi2 - zzfruVar3.zzg());
                zzfruVar4 = this.zzf;
                if (zzfruVar4 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar4 = null;
                }
                zzfruVar4.zzl(j7);
                zzfruVar5 = this.zzf;
                if (zzfruVar5 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar5 = null;
                }
                zzfrvVar = (zzfrv) zzfruVar5.zzbu();
                interfaceC7419a2.mo32855c(null);
                AbstractC6118n.m27184b(zzfrvVar);
                zzfsvVar.zza = zzfrvVar;
                zzfsvVar.zze = 3;
                if (zzv(zzfsvVar) != objE) {
                    zzfrvVar2 = zzfrvVar;
                    if (this.zzi.zza(zzfrvVar2)) {
                        String strZza3 = zzfrvVar2.zza();
                        AbstractC6118n.m27186d(strZza3, "getGwsQueryId(...)");
                        zzfsvVar.zza = null;
                        zzfsvVar.zze = 4;
                    }
                    return C1444v.f4971a;
                }
            }
            return objE;
        } catch (Throwable th2) {
            interfaceC7419a.mo32855c(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (zzs(r15, r0) == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(InterfaceC1875e interfaceC1875e) {
        zzfsz zzfszVar;
        InterfaceC7419a interfaceC7419a;
        InterfaceC7419a interfaceC7419a2;
        long jCurrentTimeMillis;
        zzfru zzfruVar;
        zzfru zzfruVar2;
        zzfru zzfruVar3;
        zzfru zzfruVar4;
        zzfru zzfruVar5;
        zzfru zzfruVar6;
        zzfrv zzfrvVar;
        zzfrv zzfrvVar2;
        if (interfaceC1875e instanceof zzfsz) {
            zzfszVar = (zzfsz) interfaceC1875e;
            int i7 = zzfszVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfszVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfszVar = new zzfsz(this, interfaceC1875e);
            }
        } else {
            zzfszVar = new zzfsz(this, interfaceC1875e);
        }
        Object obj = zzfszVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfszVar.zze;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.zzb;
                zzfszVar.zza = interfaceC7419a;
                zzfszVar.zze = 1;
                if (interfaceC7419a.mo32856d(null, zzfszVar) != objE) {
                }
                return objE;
            }
            if (i8 == 1) {
                interfaceC7419a = (InterfaceC7419a) zzfszVar.zza;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 == 2) {
                    jCurrentTimeMillis = zzfszVar.zzb;
                    interfaceC7419a2 = (InterfaceC7419a) zzfszVar.zza;
                    AbstractC1437o.m6082b(obj);
                    try {
                        zzfruVar = this.zzf;
                        if (zzfruVar == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar = null;
                        }
                        zzfruVar2 = this.zzf;
                        if (zzfruVar2 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar2 = null;
                        }
                        long jZzi = jCurrentTimeMillis - zzfruVar2.zzi();
                        zzfruVar3 = this.zzf;
                        if (zzfruVar3 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar3 = null;
                        }
                        zzfruVar.zzb(jZzi - zzfruVar3.zzg());
                        zzfruVar4 = this.zzf;
                        if (zzfruVar4 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar4 = null;
                        }
                        zzfruVar4.zzk(jCurrentTimeMillis);
                        zzfruVar5 = this.zzf;
                        if (zzfruVar5 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar5 = null;
                        }
                        zzfruVar5.zze(true);
                        zzfruVar6 = this.zzf;
                        if (zzfruVar6 == null) {
                            AbstractC6118n.m27197o("adQualityDataBuilder");
                            zzfruVar6 = null;
                        }
                        zzfrvVar = (zzfrv) zzfruVar6.zzbu();
                        interfaceC7419a2.mo32855c(null);
                        AbstractC6118n.m27184b(zzfrvVar);
                        zzfszVar.zza = zzfrvVar;
                        zzfszVar.zze = 3;
                        if (zzv(zzfszVar) != objE) {
                            zzfrvVar2 = zzfrvVar;
                            if (this.zzi.zza(zzfrvVar2)) {
                                String strZza = zzfrvVar2.zza();
                                AbstractC6118n.m27186d(strZza, "getGwsQueryId(...)");
                                zzfszVar.zza = null;
                                zzfszVar.zze = 4;
                            }
                        }
                        return objE;
                    } catch (Throwable th) {
                        interfaceC7419a2.mo32855c(null);
                        throw th;
                    }
                }
                if (i8 == 3) {
                    zzfrvVar2 = (zzfrv) zzfszVar.zza;
                    AbstractC1437o.m6082b(obj);
                    if (this.zzi.zza(zzfrvVar2)) {
                        String strZza2 = zzfrvVar2.zza();
                        AbstractC6118n.m27186d(strZza2, "getGwsQueryId(...)");
                        zzfszVar.zza = null;
                        zzfszVar.zze = 4;
                    }
                } else {
                    if (i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            }
            return C1444v.f4971a;
            if (!this.zze) {
                C1444v c1444v = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v;
            }
            this.zze = false;
            C1444v c1444v2 = C1444v.f4971a;
            interfaceC7419a.mo32855c(null);
            interfaceC7419a2 = this.zzb;
            jCurrentTimeMillis = System.currentTimeMillis();
            zzfszVar.zza = interfaceC7419a2;
            zzfszVar.zzb = jCurrentTimeMillis;
            zzfszVar.zze = 2;
            if (interfaceC7419a2.mo32856d(null, zzfszVar) != objE) {
                zzfruVar = this.zzf;
                if (zzfruVar == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar = null;
                }
                zzfruVar2 = this.zzf;
                if (zzfruVar2 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar2 = null;
                }
                long jZzi2 = jCurrentTimeMillis - zzfruVar2.zzi();
                zzfruVar3 = this.zzf;
                if (zzfruVar3 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar3 = null;
                }
                zzfruVar.zzb(jZzi2 - zzfruVar3.zzg());
                zzfruVar4 = this.zzf;
                if (zzfruVar4 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar4 = null;
                }
                zzfruVar4.zzk(jCurrentTimeMillis);
                zzfruVar5 = this.zzf;
                if (zzfruVar5 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar5 = null;
                }
                zzfruVar5.zze(true);
                zzfruVar6 = this.zzf;
                if (zzfruVar6 == null) {
                    AbstractC6118n.m27197o("adQualityDataBuilder");
                    zzfruVar6 = null;
                }
                zzfrvVar = (zzfrv) zzfruVar6.zzbu();
                interfaceC7419a2.mo32855c(null);
                AbstractC6118n.m27184b(zzfrvVar);
                zzfszVar.zza = zzfrvVar;
                zzfszVar.zze = 3;
                if (zzv(zzfszVar) != objE) {
                    zzfrvVar2 = zzfrvVar;
                    if (this.zzi.zza(zzfrvVar2)) {
                        String strZza3 = zzfrvVar2.zza();
                        AbstractC6118n.m27186d(strZza3, "getGwsQueryId(...)");
                        zzfszVar.zza = null;
                        zzfszVar.zze = 4;
                    }
                    return C1444v.f4971a;
                }
            }
            return objE;
        } catch (Throwable th2) {
            interfaceC7419a.mo32855c(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(InterfaceC1875e interfaceC1875e) {
        zzfst zzfstVar;
        InterfaceC7419a interfaceC7419a;
        long j7;
        if (interfaceC1875e instanceof zzfst) {
            zzfstVar = (zzfst) interfaceC1875e;
            int i7 = zzfstVar.zze;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzfstVar.zze = i7 - Integer.MIN_VALUE;
            } else {
                zzfstVar = new zzfst(this, interfaceC1875e);
            }
        } else {
            zzfstVar = new zzfst(this, interfaceC1875e);
        }
        Object obj = zzfstVar.zzc;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzfstVar.zze;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            InterfaceC7419a interfaceC7419a2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfstVar.zzb = interfaceC7419a2;
            zzfstVar.zza = jCurrentTimeMillis;
            zzfstVar.zze = 1;
            if (interfaceC7419a2.mo32856d(null, zzfstVar) == objE) {
                return objE;
            }
            interfaceC7419a = interfaceC7419a2;
            j7 = jCurrentTimeMillis;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = zzfstVar.zza;
            interfaceC7419a = (InterfaceC7419a) zzfstVar.zzb;
            AbstractC1437o.m6082b(obj);
        }
        try {
            zzfru zzfruVar = this.zzf;
            if (zzfruVar == null) {
                AbstractC6118n.m27197o("adQualityDataBuilder");
                zzfruVar = null;
            }
            zzfruVar.zzs(j7);
            return C1444v.f4971a;
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }
}
