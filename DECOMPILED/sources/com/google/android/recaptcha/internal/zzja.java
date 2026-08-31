package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.AbstractC6702z;
import p318o6.C6640V0;
import p318o6.InterfaceC6698x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzja extends zze {
    public InterfaceC6698x zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final InterfaceC1429g zzk;
    private final InterfaceC1429g zzl;
    private final InterfaceC1429g zzm;
    private final InterfaceC1429g zzn;
    private final InterfaceC1429g zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i7 = zzav.zza;
        this.zzk = AbstractC1430h.m6066b(zzis.zza);
        this.zzl = AbstractC1430h.m6066b(zzit.zza);
        this.zzm = AbstractC1430h.m6066b(zziu.zza);
        this.zzn = AbstractC1430h.m6066b(zziv.zza);
        this.zzo = AbstractC1430h.m6066b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzE(zzsc zzscVar, InterfaceC1875e interfaceC1875e) {
        zzim zzimVar;
        zzbd zzbdVar;
        zzja zzjaVar;
        if (interfaceC1875e instanceof zzim) {
            zzimVar = (zzim) interfaceC1875e;
            int i7 = zzimVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzimVar = new zzim(this, interfaceC1875e);
            }
        } else {
            zzimVar = new zzim(this, interfaceC1875e);
        }
        Object objZzd = zzimVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzimVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objZzd);
            try {
                zzff zzffVar = (zzff) this.zzn.getValue();
                zzek zzekVar = this.zzj;
                zzimVar.zzd = this;
                zzimVar.zzc = 1;
                objZzd = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                if (objZzd == objE) {
                    return objE;
                }
                zzjaVar = this;
            } catch (zzbd e7) {
                zzbdVar = e7;
                zzjaVar = this;
                zzjaVar.zzA().mo28288o0(zzbdVar);
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzjaVar = zzimVar.zzd;
            try {
                AbstractC1437o.m6082b(objZzd);
            } catch (zzbd e8) {
                zzbdVar = e8;
                zzjaVar.zzA().mo28288o0(zzbdVar);
            }
        }
        AbstractC6672k.m28227d(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) objZzd, null), 3, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzF(String str, InterfaceC1875e interfaceC1875e) {
        zzio zzioVar;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzbd zzbdVar;
        zzen zzenVar;
        if (interfaceC1875e instanceof zzio) {
            zzioVar = (zzio) interfaceC1875e;
            int i7 = zzioVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzioVar = new zzio(this, interfaceC1875e);
            }
        } else {
            zzioVar = new zzio(this, interfaceC1875e);
        }
        Object obj = zzioVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzioVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            this.zzp = this.zzj.zzf(26);
            try {
                String strZza = ((zzbr) this.zzl.getValue()).zza();
                zzioVar.zzd = this;
                zzioVar.zze = str;
                zzioVar.zzf = strZza;
                zzioVar.zzc = 1;
                Object objZzw = zzw(zzioVar);
                if (objZzw == objE) {
                    return objE;
                }
                str2 = str;
                str3 = strZza;
                obj = objZzw;
                zzjaVar2 = this;
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e7) {
                exc = e7;
                zzjaVar = this;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().mo28288o0(zzbdVar);
                return C1444v.f4971a;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = zzioVar.zzf;
            String str5 = zzioVar.zze;
            zzjaVar = zzioVar.zzd;
            try {
                AbstractC1437o.m6082b(obj);
                str3 = str4;
                str2 = str5;
                zzjaVar2 = zzjaVar;
                try {
                    ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
                } catch (Exception e8) {
                    zzjaVar = zzjaVar2;
                    exc = e8;
                    zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                    zzenVar = zzjaVar.zzp;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar);
                    }
                    zzjaVar.zzp = null;
                    zzjaVar.zzA().mo28288o0(zzbdVar);
                }
            } catch (Exception e9) {
                exc = e9;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().mo28288o0(zzbdVar);
                return C1444v.f4971a;
            }
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzG(String str, InterfaceC1875e interfaceC1875e) {
        zzix zzixVar;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (interfaceC1875e instanceof zzix) {
            zzixVar = (zzix) interfaceC1875e;
            int i7 = zzixVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzixVar = new zzix(this, interfaceC1875e);
            }
        } else {
            zzixVar = new zzix(this, interfaceC1875e);
        }
        Object objZzb = zzixVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzixVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objZzb);
            zzcb zzcbVar = this.zzg;
            zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
            zzixVar.zzd = this;
            zzixVar.zze = str;
            zzixVar.zzc = 1;
            objZzb = zzcbVar.zzb(zzjeVarArr, zzixVar);
            if (objZzb != objE) {
                zzjaVar = this;
            }
            return objE;
        }
        if (i8 == 1) {
            str = zzixVar.zze;
            zzjaVar = zzixVar.zzd;
            AbstractC1437o.m6082b(objZzb);
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzixVar.zze;
            zzjaVar2 = zzixVar.zzd;
            AbstractC1437o.m6082b(objZzb);
        }
        zzjaVar2.zza = AbstractC6702z.m28298b(null, 1, null);
        zzek zzekVar = zzjaVar2.zzj;
        zzekVar.zzc(str);
        AbstractC6672k.m28227d(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3, null);
        return C1444v.f4971a;
        if (((Boolean) objZzb).booleanValue()) {
            return C1444v.f4971a;
        }
        zzcb zzcbVar2 = zzjaVar.zzg;
        zzje zzjeVar = zzje.zzb;
        zzixVar.zzd = zzjaVar;
        zzixVar.zze = str;
        zzixVar.zzc = 2;
        if (zzcbVar2.zzc(zzjeVar, zzixVar) != objE) {
            zzjaVar2 = zzjaVar;
            zzjaVar2.zza = AbstractC6702z.m28298b(null, 1, null);
            zzek zzekVar2 = zzjaVar2.zzj;
            zzekVar2.zzc(str);
            AbstractC6672k.m28227d(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3, null);
            return C1444v.f4971a;
        }
        return objE;
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC6698x zzA() {
        InterfaceC6698x interfaceC6698x = this.zza;
        if (interfaceC6698x != null) {
            return interfaceC6698x;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(AbstractC1638q.m6594h0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, InterfaceC1875e interfaceC1875e) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (r8.zzG(r4, r2) != r3) goto L44;
     */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, InterfaceC1875e interfaceC1875e) {
        zzip zzipVar;
        String str2;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        String str3;
        zzja zzjaVar4;
        InterfaceC6698x interfaceC6698xZzA;
        zzja zzjaVar5;
        zzbd zzbdVarZza;
        InterfaceC6698x interfaceC6698x;
        if (interfaceC1875e instanceof zzip) {
            zzipVar = (zzip) interfaceC1875e;
            int i7 = zzipVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzipVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzipVar = new zzip(this, interfaceC1875e);
            }
        } else {
            zzipVar = new zzip(this, interfaceC1875e);
        }
        Object objZza = zzipVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzipVar.zzc;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objZza);
            zzcb zzcbVar = this.zzg;
            zzje zzjeVar = zzje.zzd;
            zzipVar.zzd = this;
            zzipVar.zze = str;
            zzipVar.zzc = 1;
            objZza = zzcbVar.zza(zzjeVar, zzipVar);
            if (objZza != objE) {
                str2 = str;
                zzjaVar = this;
            }
            return objE;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                str2 = zzipVar.zze;
                zzjaVar2 = zzipVar.zzd;
                AbstractC1437o.m6082b(objZza);
                if (!((Boolean) objZza).booleanValue()) {
                    zzipVar.zzd = zzjaVar2;
                    zzipVar.zze = str2;
                    zzipVar.zzc = 3;
                }
                zzjaVar3 = zzjaVar2;
                interfaceC6698xZzA = zzjaVar3.zzA();
                zzipVar.zzd = zzjaVar3;
                zzipVar.zze = str2;
                zzipVar.zzc = 4;
                if (interfaceC6698xZzA.await(zzipVar) != objE) {
                    zzjaVar5 = zzjaVar3;
                    InterfaceC6698x interfaceC6698xM28298b = AbstractC6702z.m28298b(null, 1, null);
                    zzjaVar5.zze.put(str2, interfaceC6698xM28298b);
                    zztp zztpVarZzf = zztq.zzf();
                    zztpVarZzf.zze(str2);
                    byte[] bArrZzd = ((zztq) zztpVarZzf.zzk()).zzd();
                    AbstractC6672k.m28227d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3, null);
                    zzipVar.zzd = zzjaVar5;
                    zzipVar.zze = str2;
                    zzipVar.zzc = 5;
                    objZza = interfaceC6698xM28298b.await(zzipVar);
                    if (objZza != objE) {
                        str3 = str2;
                        zzjaVar4 = zzjaVar5;
                        zzsi zzsiVar = (zzsi) objZza;
                        zzsh zzshVarZzf = zzsi.zzf();
                        zzshVarZzf.zze(str3);
                        zzsl zzslVarZzf = zzsm.zzf();
                        zzslVarZzf.zze(zzsiVar.zzl());
                        zzshVarZzf.zzq(zzslVarZzf);
                        zzsj zzsjVarZzf = zzsk.zzf();
                        zzsjVarZzf.zze(zzsiVar.zzj());
                        zzsjVarZzf.zzf(zzsiVar.zzM());
                        zzshVarZzf.zzr(zzsjVarZzf);
                        C1436n.a aVar = C1436n.f4958b;
                        return C1436n.m6073b(zzshVarZzf.zzk());
                    }
                }
                return objE;
            }
            if (i8 == 3) {
                str2 = zzipVar.zze;
                zzjaVar3 = zzipVar.zzd;
                AbstractC1437o.m6082b(objZza);
                try {
                    interfaceC6698xZzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str2;
                    zzipVar.zzc = 4;
                    if (interfaceC6698xZzA.await(zzipVar) != objE) {
                        zzjaVar5 = zzjaVar3;
                        InterfaceC6698x interfaceC6698xM28298b2 = AbstractC6702z.m28298b(null, 1, null);
                        zzjaVar5.zze.put(str2, interfaceC6698xM28298b2);
                        zztp zztpVarZzf2 = zztq.zzf();
                        zztpVarZzf2.zze(str2);
                        byte[] bArrZzd2 = ((zztq) zztpVarZzf2.zzk()).zzd();
                        AbstractC6672k.m28227d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3, null);
                        zzipVar.zzd = zzjaVar5;
                        zzipVar.zze = str2;
                        zzipVar.zzc = 5;
                        objZza = interfaceC6698xM28298b2.await(zzipVar);
                        if (objZza != objE) {
                            str3 = str2;
                            zzjaVar4 = zzjaVar5;
                            zzsi zzsiVar2 = (zzsi) objZza;
                            zzsh zzshVarZzf2 = zzsi.zzf();
                            zzshVarZzf2.zze(str3);
                            zzsl zzslVarZzf2 = zzsm.zzf();
                            zzslVarZzf2.zze(zzsiVar2.zzl());
                            zzshVarZzf2.zzq(zzslVarZzf2);
                            zzsj zzsjVarZzf2 = zzsk.zzf();
                            zzsjVarZzf2.zze(zzsiVar2.zzj());
                            zzsjVarZzf2.zzf(zzsiVar2.zzM());
                            zzshVarZzf2.zzr(zzsjVarZzf2);
                            C1436n.a aVar2 = C1436n.f4958b;
                            return C1436n.m6073b(zzshVarZzf2.zzk());
                        }
                    }
                    return objE;
                } catch (Exception e7) {
                    e = e7;
                    str3 = str2;
                    zzjaVar4 = zzjaVar3;
                    zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                    interfaceC6698x = (InterfaceC6698x) zzjaVar4.zze.remove(str3);
                    if (interfaceC6698x != null) {
                        AbstractC6087b.m27120a(interfaceC6698x.mo28288o0(zzbdVarZza));
                    }
                    C1436n.a aVar3 = C1436n.f4958b;
                    return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVarZza));
                }
            }
            if (i8 != 4) {
                if (i8 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = zzipVar.zze;
                zzjaVar4 = zzipVar.zzd;
                try {
                    AbstractC1437o.m6082b(objZza);
                    zzsi zzsiVar3 = (zzsi) objZza;
                    zzsh zzshVarZzf3 = zzsi.zzf();
                    zzshVarZzf3.zze(str3);
                    zzsl zzslVarZzf3 = zzsm.zzf();
                    zzslVarZzf3.zze(zzsiVar3.zzl());
                    zzshVarZzf3.zzq(zzslVarZzf3);
                    zzsj zzsjVarZzf3 = zzsk.zzf();
                    zzsjVarZzf3.zze(zzsiVar3.zzj());
                    zzsjVarZzf3.zzf(zzsiVar3.zzM());
                    zzshVarZzf3.zzr(zzsjVarZzf3);
                    C1436n.a aVar4 = C1436n.f4958b;
                    return C1436n.m6073b(zzshVarZzf3.zzk());
                } catch (Exception e8) {
                    e = e8;
                    zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                    interfaceC6698x = (InterfaceC6698x) zzjaVar4.zze.remove(str3);
                    if (interfaceC6698x != null) {
                        AbstractC6087b.m27120a(interfaceC6698x.mo28288o0(zzbdVarZza));
                    }
                    C1436n.a aVar5 = C1436n.f4958b;
                    return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVarZza));
                }
            }
            str2 = zzipVar.zze;
            zzjaVar5 = zzipVar.zzd;
            try {
                AbstractC1437o.m6082b(objZza);
                InterfaceC6698x interfaceC6698xM28298b3 = AbstractC6702z.m28298b(null, 1, null);
                zzjaVar5.zze.put(str2, interfaceC6698xM28298b3);
                zztp zztpVarZzf3 = zztq.zzf();
                zztpVarZzf3.zze(str2);
                byte[] bArrZzd3 = ((zztq) zztpVarZzf3.zzk()).zzd();
                AbstractC6672k.m28227d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(bArrZzd3, 0, bArrZzd3.length), null), 3, null);
                zzipVar.zzd = zzjaVar5;
                zzipVar.zze = str2;
                zzipVar.zzc = 5;
                objZza = interfaceC6698xM28298b3.await(zzipVar);
                if (objZza != objE) {
                    str3 = str2;
                    zzjaVar4 = zzjaVar5;
                    zzsi zzsiVar4 = (zzsi) objZza;
                    zzsh zzshVarZzf4 = zzsi.zzf();
                    zzshVarZzf4.zze(str3);
                    zzsl zzslVarZzf4 = zzsm.zzf();
                    zzslVarZzf4.zze(zzsiVar4.zzl());
                    zzshVarZzf4.zzq(zzslVarZzf4);
                    zzsj zzsjVarZzf4 = zzsk.zzf();
                    zzsjVarZzf4.zze(zzsiVar4.zzj());
                    zzsjVarZzf4.zzf(zzsiVar4.zzM());
                    zzshVarZzf4.zzr(zzsjVarZzf4);
                    C1436n.a aVar6 = C1436n.f4958b;
                    return C1436n.m6073b(zzshVarZzf4.zzk());
                }
                return objE;
            } catch (Exception e9) {
                e = e9;
                str3 = str2;
                zzjaVar4 = zzjaVar5;
                zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                interfaceC6698x = (InterfaceC6698x) zzjaVar4.zze.remove(str3);
                if (interfaceC6698x != null) {
                    AbstractC6087b.m27120a(interfaceC6698x.mo28288o0(zzbdVarZza));
                }
                C1436n.a aVar7 = C1436n.f4958b;
                return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVarZza));
            }
        }
        str2 = zzipVar.zze;
        zzjaVar = zzipVar.zzd;
        AbstractC1437o.m6082b(objZza);
        if (((Boolean) objZza).booleanValue()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzav, null);
            C1436n.a aVar8 = C1436n.f4958b;
            return C1436n.m6073b(AbstractC1437o.m6081a(zzbdVar));
        }
        zzcb zzcbVar2 = zzjaVar.zzg;
        zzje zzjeVar2 = zzje.zzc;
        zzipVar.zzd = zzjaVar;
        zzipVar.zze = str2;
        zzipVar.zzc = 2;
        objZza = zzcbVar2.zza(zzjeVar2, zzipVar);
        if (objZza != objE) {
            zzjaVar2 = zzjaVar;
            if (!((Boolean) objZza).booleanValue()) {
                zzipVar.zzd = zzjaVar2;
                zzipVar.zze = str2;
                zzipVar.zzc = 3;
            }
            zzjaVar3 = zzjaVar2;
            interfaceC6698xZzA = zzjaVar3.zzA();
            zzipVar.zzd = zzjaVar3;
            zzipVar.zze = str2;
            zzipVar.zzc = 4;
            if (interfaceC6698xZzA.await(zzipVar) != objE) {
                zzjaVar5 = zzjaVar3;
                InterfaceC6698x interfaceC6698xM28298b4 = AbstractC6702z.m28298b(null, 1, null);
                zzjaVar5.zze.put(str2, interfaceC6698xM28298b4);
                zztp zztpVarZzf4 = zztq.zzf();
                zztpVarZzf4.zze(str2);
                byte[] bArrZzd4 = ((zztq) zztpVarZzf4.zzk()).zzd();
                AbstractC6672k.m28227d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(bArrZzd4, 0, bArrZzd4.length), null), 3, null);
                zzipVar.zzd = zzjaVar5;
                zzipVar.zze = str2;
                zzipVar.zzc = 5;
                objZza = interfaceC6698xM28298b4.await(zzipVar);
                if (objZza != objE) {
                    str3 = str2;
                    zzjaVar4 = zzjaVar5;
                    zzsi zzsiVar5 = (zzsi) objZza;
                    zzsh zzshVarZzf5 = zzsi.zzf();
                    zzshVarZzf5.zze(str3);
                    zzsl zzslVarZzf5 = zzsm.zzf();
                    zzslVarZzf5.zze(zzsiVar5.zzl());
                    zzshVarZzf5.zzq(zzslVarZzf5);
                    zzsj zzsjVarZzf5 = zzsk.zzf();
                    zzsjVarZzf5.zze(zzsiVar5.zzj());
                    zzsjVarZzf5.zzf(zzsiVar5.zzM());
                    zzshVarZzf5.zzr(zzsjVarZzf5);
                    C1436n.a aVar9 = C1436n.f4958b;
                    return C1436n.m6073b(zzshVarZzf5.zzk());
                }
            }
        }
        return objE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbd zzbdVar, InterfaceC1875e interfaceC1875e) {
        if (AbstractC6118n.m27183a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return C1444v.f4971a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzsc zzscVar, InterfaceC1875e interfaceC1875e) {
        zzir zzirVar;
        if (interfaceC1875e instanceof zzir) {
            zzirVar = (zzir) interfaceC1875e;
            int i7 = zzirVar.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i7 - Integer.MIN_VALUE;
            } else {
                zzirVar = new zzir(this, interfaceC1875e);
            }
        } else {
            zzirVar = new zzir(this, interfaceC1875e);
        }
        Object obj = zzirVar.zza;
        Object objE = AbstractC2005b.m8369e();
        int i8 = zzirVar.zzc;
        if (i8 != 0) {
            if (i8 == 1) {
                AbstractC1437o.m6082b(obj);
                C1436n.a aVar = C1436n.f4958b;
                return C1436n.m6073b(AbstractC1437o.m6081a(new zzbd(zzbb.zzb, zzba.zzav, null)));
            }
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            C1436n.a aVar2 = C1436n.f4958b;
            return C1436n.m6073b(C1444v.f4971a);
        }
        AbstractC1437o.m6082b(obj);
        if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
            this.zzf = zzscVar;
            String strZzd = this.zzc.zzd();
            zzirVar.zzc = 2;
        } else {
            zzcb zzcbVar = this.zzg;
            zzje zzjeVar = zzje.zzd;
            zzirVar.zzc = 1;
        }
        return objE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j7, Exception exc, InterfaceC1875e interfaceC1875e) {
        exc.getMessage();
        InterfaceC6698x interfaceC6698x = (InterfaceC6698x) this.zze.remove(str);
        if (interfaceC6698x != null) {
            AbstractC6087b.m27120a(interfaceC6698x.mo28288o0(exc));
        }
        return C1444v.f4971a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, InterfaceC1875e interfaceC1875e) {
        return ((exc instanceof C6640V0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(InterfaceC1875e interfaceC1875e) {
        return AbstractC6668i.m28186g(this.zzq.zzb().mo12635Q(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), interfaceC1875e);
    }

    public final Object zzx(InterfaceC1875e interfaceC1875e) {
        Object objM28186g = AbstractC6668i.m28186g(this.zzq.zzb().mo12635Q(), new zzil(this, null), interfaceC1875e);
        return objM28186g == AbstractC2005b.m8369e() ? objM28186g : C1444v.f4971a;
    }
}
