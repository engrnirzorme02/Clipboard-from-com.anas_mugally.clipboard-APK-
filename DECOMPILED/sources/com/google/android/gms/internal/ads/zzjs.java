package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
final class zzjs extends zze implements zzik {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzda zzB;
    private final zzlz zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private zzls zzG;
    private zzlt zzH;
    private zzij zzI;
    private zzaw zzJ;
    private zzam zzK;
    private Object zzL;
    private Surface zzM;
    private int zzN;
    private zzeg zzO;
    private zzc zzP;
    private float zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private int zzU;
    private zzam zzV;
    private zzld zzW;
    private int zzX;
    private long zzY;
    private zzwi zzZ;
    final zzyn zzb;
    final zzaw zzc;
    private final zzde zze = new zzde(zzdb.zza);
    private final Context zzf;
    private final zzba zzg;
    private final zzll[] zzh;
    private final zzll[] zzi;
    private final zzym zzj;
    private final zzdl zzk;
    private final zzkd zzl;
    private final zzkf zzm;
    private final zzdr zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbc zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmd zzs;
    private final Looper zzt;
    private final zzyu zzu;
    private final zzdb zzv;
    private final zzir zzw;
    private final zzjq zzx;
    private final zzmb zzy;
    private final zzmc zzz;

    static {
        zzak.zzb("media3.exoplayer");
    }

    public zzjs(zzii zziiVar, zzba zzbaVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzeo.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(str);
            sb.append("]");
            zzds.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zziiVar.zza.getApplicationContext();
            this.zzs = (zzmd) zziiVar.zzh.apply(zziiVar.zzb);
            this.zzU = zziiVar.zzj;
            this.zzP = zziiVar.zzk;
            this.zzN = zziiVar.zzl;
            this.zzR = false;
            this.zzA = zziiVar.zzq;
            zzir zzirVar = new zzir(this, null);
            this.zzw = zzirVar;
            this.zzx = new zzjq(null);
            zzll[] zzllVarArrZza = ((zzlq) zziiVar.zzc.zza()).zza(new Handler(zziiVar.zzi), zzirVar, zzirVar, zzirVar, zzirVar);
            this.zzh = zzllVarArrZza;
            int length = zzllVarArrZza.length;
            this.zzi = new zzll[2];
            int i7 = 0;
            while (true) {
                zzll[] zzllVarArr = this.zzi;
                int length2 = zzllVarArr.length;
                if (i7 >= 2) {
                    break;
                }
                zzll zzllVar = this.zzh[i7];
                zzllVarArr[i7] = null;
                i7++;
            }
            zzym zzymVar = (zzym) zziiVar.zze.zza();
            this.zzj = zzymVar;
            zzyu zzyuVar = (zzyu) zziiVar.zzg.zza();
            this.zzu = zzyuVar;
            this.zzr = zziiVar.zzm;
            this.zzH = zziiVar.zzn;
            this.zzG = zziiVar.zzo;
            Looper looper = zziiVar.zzi;
            this.zzt = looper;
            zzdb zzdbVar = zziiVar.zzb;
            this.zzv = zzdbVar;
            this.zzg = zzbaVar;
            this.zzn = new zzdr(looper, zzdbVar, new zzdn() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzdn
                public final /* synthetic */ void zza(Object obj, zzr zzrVar) {
                    this.zza.zzH((zzay) obj, zzrVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzZ = new zzwi(0);
            this.zzI = zzij.zza;
            int length3 = this.zzh.length;
            zzyn zzynVar = new zzyn(new zzlo[2], new zzyf[2], zzbm.zza, null);
            this.zzb = zzynVar;
            this.zzp = new zzbc();
            zzav zzavVar = new zzav();
            zzavVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzymVar.zzd();
            zzavVar.zzb(29, true);
            zzavVar.zzb(23, false);
            zzavVar.zzb(25, false);
            zzavVar.zzb(33, false);
            zzavVar.zzb(26, false);
            zzavVar.zzb(34, false);
            zzaw zzawVarZze = zzavVar.zze();
            this.zzc = zzawVarZze;
            zzav zzavVar2 = new zzav();
            zzavVar2.zzd(zzawVarZze);
            zzavVar2.zza(4);
            zzavVar2.zza(10);
            this.zzJ = zzavVar2.zze();
            this.zzk = zzdbVar.zzd(looper, null);
            zzkd zzkdVar = new zzkd() { // from class: com.google.android.gms.internal.ads.zzis
                @Override // com.google.android.gms.internal.ads.zzkd
                public final /* synthetic */ void zza(zzkc zzkcVar) {
                    this.zza.zzI(zzkcVar);
                }
            };
            this.zzl = zzkdVar;
            this.zzW = zzld.zza(zzynVar);
            this.zzs.zzx(zzbaVar, looper);
            final zzox zzoxVar = new zzox(zziiVar.zzu);
            zzkf zzkfVar = new zzkf(this.zzf, this.zzh, this.zzi, zzymVar, zzynVar, (zzkj) zziiVar.zzf.zza(), zzyuVar, 0, false, this.zzs, this.zzH, zziiVar.zzv, zziiVar.zzp, false, false, looper, zzdbVar, zzkdVar, zzoxVar, null, this.zzI, this.zzx);
            this.zzm = zzkfVar;
            Looper looperZzn = zzkfVar.zzn();
            this.zzQ = 1.0f;
            zzam zzamVar = zzam.zza;
            this.zzK = zzamVar;
            this.zzV = zzamVar;
            this.zzX = -1;
            int i8 = zzcn.zza;
            this.zzS = true;
            zzd(this.zzs);
            zzyuVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z7 = zziiVar.zzs;
                zzdbVar.zzd(zzkfVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzot zzotVarZza = zzot.zza(context);
                        if (zzotVarZza == null) {
                            zzds.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z7) {
                            this.zzB(zzotVarZza);
                        }
                        zzoxVar.zzb(zzotVarZza.zzb());
                    }
                });
            }
            zzda zzdaVar = new zzda(0, looperZzn, looper, zzdbVar, new zzcz() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzcz
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzJ(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdaVar;
            zzdaVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzK();
                }
            });
            new zzhl(zziiVar.zza, looperZzn, zziiVar.zzi, this.zzw, zzdbVar);
            this.zzy = new zzmb(zziiVar.zza, looperZzn, zzdbVar);
            this.zzz = new zzmc(zziiVar.zza, looperZzn, zzdbVar);
            int i9 = zzl.zza;
            zzbu zzbuVar = zzbu.zza;
            this.zzO = zzeg.zza;
            this.zzC = new zzlz(this, this.zzw, zzdbVar, zziiVar.zzr);
            zzkfVar.zzg(this.zzG);
            zzkfVar.zzi(this.zzP, false);
            zzam(1, 3, this.zzP);
            zzam(2, 4, Integer.valueOf(this.zzN));
            zzam(2, 5, 0);
            zzam(1, 9, Boolean.valueOf(this.zzR));
            zzam(6, 8, this.zzx);
            zzam(-1, 16, Integer.valueOf(this.zzU));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
    public final void zzN(zzhz zzhzVar) {
        zzld zzldVar = this.zzW;
        zzld zzldVarZzh = zzldVar.zzh(zzldVar.zzb);
        zzldVarZzh.zzq = zzldVarZzh.zzs;
        zzldVarZzh.zzr = 0L;
        zzld zzldVarZzae = zzae(zzldVarZzh, 1);
        if (zzhzVar != null) {
            zzldVarZzae = zzldVarZzae.zzf(zzhzVar);
        }
        this.zzD++;
        this.zzm.zzh();
        zzab(zzldVarZzae, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzY(zzld zzldVar) {
        zzbe zzbeVar = zzldVar.zza;
        return zzbeVar.zzg() ? this.zzX : zzbeVar.zzo(zzldVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzZ(zzld zzldVar) {
        zzup zzupVar = zzldVar.zzb;
        if (!zzupVar.zzb()) {
            return zzeo.zzp(zzaa(zzldVar));
        }
        zzbe zzbeVar = zzldVar.zza;
        zzbeVar.zzo(zzupVar.zza, this.zzp);
        long j7 = zzldVar.zzc;
        if (j7 != -9223372036854775807L) {
            return zzeo.zzp(0L) + zzeo.zzp(j7);
        }
        long j8 = zzbeVar.zzb(zzY(zzldVar), this.zza, 0L).zzl;
        return zzeo.zzp(0L);
    }

    private final long zzaa(zzld zzldVar) {
        zzbe zzbeVar = zzldVar.zza;
        if (zzbeVar.zzg()) {
            return zzeo.zzq(this.zzY);
        }
        long j7 = zzldVar.zzs;
        zzup zzupVar = zzldVar.zzb;
        if (zzupVar.zzb()) {
            return j7;
        }
        zzag(zzbeVar, zzupVar, j7);
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0308  */
    /* JADX WARN: Code duplicated, block: B:117:0x031c  */
    /* JADX WARN: Code duplicated, block: B:119:0x032c  */
    /* JADX WARN: Code duplicated, block: B:122:0x033c  */
    /* JADX WARN: Code duplicated, block: B:125:0x034a  */
    /* JADX WARN: Code duplicated, block: B:130:0x035d  */
    /* JADX WARN: Code duplicated, block: B:133:0x036e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0383  */
    /* JADX WARN: Code duplicated, block: B:139:0x0399  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03de  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0401  */
    /* JADX WARN: Code duplicated, block: B:158:0x0411  */
    /* JADX WARN: Code duplicated, block: B:161:0x041c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0430  */
    /* JADX WARN: Code duplicated, block: B:165:0x0434  */
    /* JADX WARN: Code duplicated, block: B:168:0x0443  */
    /* JADX WARN: Code duplicated, block: B:171:0x0453  */
    /* JADX WARN: Code duplicated, block: B:174:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x0472  */
    /* JADX WARN: Code duplicated, block: B:179:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x047d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x048a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x049c  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:208:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136 A[LOOP:1: B:52:0x0130->B:54:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:87:0x0210  */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0220  */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x028c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.google.android.gms.internal.ads.zzav] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzbe] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.android.gms.internal.ads.zzbe] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void zzab(final zzld zzldVar, final int i7, boolean z7, int i8, long j7, int i9, boolean z8) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        Pair pair;
        boolean z10;
        boolean z11;
        int i13;
        Pair pair2;
        boolean zBooleanValue;
        final int iIntValue;
        final zzaj zzajVar;
        zzal zzalVarZza;
        List list;
        int i14;
        zzao zzaoVar;
        int i15;
        zzbe zzbeVarZzo;
        zzam zzamVarZzw;
        boolean zEquals;
        int i16;
        int i17;
        int i18;
        zzhz zzhzVar;
        zzhz zzhzVar2;
        zzyn zzynVar;
        zzyn zzynVar2;
        zzaw zzawVar;
        boolean zZzv;
        zze zzeVar;
        zzbe zzbeVarZzo2;
        boolean z12;
        zzbe zzbeVarZzo3;
        ?? r15;
        int iZzi;
        int i19;
        boolean z13;
        ?? Zzo;
        int iZzq;
        ?? r7;
        zzbe zzbeVarZzo4;
        boolean z14;
        long j8;
        ?? r12;
        zzbe zzbeVarZzo5;
        ?? r9;
        boolean zZzg;
        ?? r8;
        ?? r10;
        ?? r11;
        ?? r13;
        ?? r14;
        ?? r16;
        ?? r17;
        zzaw zzawVarZze;
        zzdr zzdrVar;
        zzbc zzbcVar;
        int i20;
        Object obj;
        zzaj zzajVar2;
        Object obj2;
        int i21;
        long jZzac;
        long jZzac2;
        int iZzq2;
        Object obj3;
        zzaj zzajVar3;
        Object obj4;
        int i22;
        long jZzp;
        long jZzp2;
        zzup zzupVar;
        final int i23 = i8;
        zzld zzldVar2 = this.zzW;
        this.zzW = zzldVar;
        ?? r18 = zzldVar2.zza;
        zzbe zzbeVar = zzldVar.zza;
        boolean zEquals2 = r18.equals(zzbeVar);
        if (!zzbeVar.zzg() || !r18.zzg()) {
            i10 = 3;
            if (zzbeVar.zzg() != r18.zzg()) {
                pair2 = new Pair(Boolean.TRUE, 3);
            } else {
                zzup zzupVar2 = zzldVar2.zzb;
                Object obj5 = zzupVar2.zza;
                zzbc zzbcVar2 = this.zzp;
                int i24 = r18.zzo(obj5, zzbcVar2).zzc;
                zzbd zzbdVar = this.zza;
                Object obj6 = r18.zzb(i24, zzbdVar, 0L).zzb;
                i11 = 0;
                zzup zzupVar3 = zzldVar.zzb;
                if (obj6.equals(zzbeVar.zzb(zzbeVar.zzo(zzupVar3.zza, zzbcVar2).zzc, zzbdVar, 0L).zzb)) {
                    if (z7) {
                        if (i23 != 0) {
                            i12 = i23;
                        } else if (zzupVar2.zzd < zzupVar3.zzd) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i23 = 0;
                            z10 = true;
                        } else {
                            i12 = 0;
                        }
                        z9 = true;
                    } else {
                        i12 = i23;
                        z9 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                    int i25 = i12;
                    z10 = z9;
                    i23 = i25;
                } else {
                    if (z7) {
                        if (i23 == 0) {
                            i23 = 0;
                            z10 = true;
                            i13 = 1;
                        } else {
                            z10 = true;
                            z11 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z10 && i23 == 1) {
                        z10 = z11;
                        i13 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i13 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzbeVar.zzg()) {
                    zzajVar = null;
                } else {
                    zzajVar = zzbeVar.zzb(zzbeVar.zzo(zzldVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
                }
                this.zzV = zzam.zza;
            } else {
                zzajVar = null;
            }
            if (zBooleanValue || !zzldVar2.zzj.equals(zzldVar.zzj)) {
                zzalVarZza = this.zzV.zza();
                list = zzldVar.zzj;
                for (i14 = i11; i14 < list.size(); i14++) {
                    zzaoVar = (zzao) list.get(i14);
                    for (i15 = i11; i15 < zzaoVar.zza(); i15++) {
                        zzaoVar.zzb(i15).zza(zzalVarZza);
                    }
                }
                this.zzV = zzalVarZza.zzw();
            }
            zzbeVarZzo = zzo();
            if (zzbeVarZzo.zzg()) {
                zzamVarZzw = this.zzV;
            } else {
                zzaj zzajVar4 = zzbeVarZzo.zzb(zzq(), this.zza, 0L).zzd;
                zzal zzalVarZza2 = this.zzV.zza();
                zzalVarZza2.zzv(zzajVar4.zzd);
                zzamVarZzw = zzalVarZza2.zzw();
            }
            zEquals = zzamVarZzw.equals(this.zzK);
            this.zzK = zzamVarZzw;
            if (zzldVar2.zzl != zzldVar.zzl) {
                i16 = 1;
            } else {
                i16 = i11;
            }
            if (zzldVar2.zze != zzldVar.zze) {
                i17 = 1;
            } else {
                i17 = i11;
            }
            if (i17 == 0 || i16 != 0) {
                zzak();
            }
            if (zzldVar2.zzg != zzldVar.zzg) {
                i18 = 1;
            } else {
                i18 = i11;
            }
            if (!zEquals2) {
                this.zzn.zzd(i11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjl
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj7) {
                        int i26 = zzjs.zzd;
                        ((zzay) obj7).zzb(zzldVar.zza, i7);
                    }
                });
            }
            if (z10) {
                zzbcVar = new zzbc();
                if (r18.zzg()) {
                    i20 = i9;
                    obj = null;
                    zzajVar2 = null;
                    obj2 = null;
                    i21 = -1;
                } else {
                    Object obj7 = zzldVar2.zzb.zza;
                    r18.zzo(obj7, zzbcVar);
                    int i26 = zzbcVar.zzc;
                    int iZze = r18.zze(obj7);
                    zzbd zzbdVar2 = this.zza;
                    obj = r18.zzb(i26, zzbdVar2, 0L).zzb;
                    zzajVar2 = zzbdVar2.zzd;
                    obj2 = obj7;
                    i20 = i26;
                    i21 = iZze;
                }
                if (i23 == 0) {
                    zzupVar = zzldVar2.zzb;
                    if (zzupVar.zzb()) {
                        jZzac = zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc);
                        jZzac2 = zzac(zzldVar2);
                    } else {
                        if (zzupVar.zze != -1) {
                            jZzac = zzac(this.zzW);
                        } else {
                            jZzac = zzbcVar.zzd;
                        }
                        jZzac2 = jZzac;
                    }
                } else if (zzldVar2.zzb.zzb()) {
                    jZzac = zzldVar2.zzs;
                    jZzac2 = zzac(zzldVar2);
                } else {
                    jZzac = zzldVar2.zzs;
                    jZzac2 = jZzac;
                }
                String str = zzeo.zza;
                zzup zzupVar4 = zzldVar2.zzb;
                final zzaz zzazVar = new zzaz(obj, i20, zzajVar2, obj2, i21, zzeo.zzp(jZzac), zzeo.zzp(jZzac2), zzupVar4.zzb, zzupVar4.zzc);
                iZzq2 = zzq();
                if (this.zzW.zza.zzg()) {
                    obj3 = null;
                    zzajVar3 = null;
                    obj4 = null;
                    i22 = -1;
                } else {
                    zzld zzldVar3 = this.zzW;
                    Object obj8 = zzldVar3.zzb.zza;
                    zzldVar3.zza.zzo(obj8, this.zzp);
                    int iZze2 = this.zzW.zza.zze(obj8);
                    zzbe zzbeVar2 = this.zzW.zza;
                    zzbd zzbdVar3 = this.zza;
                    Object obj9 = zzbeVar2.zzb(iZzq2, zzbdVar3, 0L).zzb;
                    i22 = iZze2;
                    zzajVar3 = zzbdVar3.zzd;
                    obj3 = obj9;
                    obj4 = obj8;
                }
                jZzp = zzeo.zzp(j7);
                if (this.zzW.zzb.zzb()) {
                    jZzp2 = zzeo.zzp(zzac(this.zzW));
                } else {
                    jZzp2 = jZzp;
                }
                zzup zzupVar5 = this.zzW.zzb;
                final zzaz zzazVar2 = new zzaz(obj3, iZzq2, zzajVar3, obj4, i22, jZzp, jZzp2, zzupVar5.zzb, zzupVar5.zzc);
                this.zzn.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzo(zzazVar, zzazVar2, i23);
                    }
                });
            } else {
                zBooleanValue = zBooleanValue;
                i16 = i16;
                zEquals = zEquals;
            }
            if (zBooleanValue) {
                this.zzn.zzd(1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjn
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzc(zzajVar, iIntValue);
                    }
                });
            }
            zzhzVar = zzldVar2.zzf;
            zzhzVar2 = zzldVar.zzf;
            if (zzhzVar != zzhzVar2) {
                zzdrVar = this.zzn;
                zzdrVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjo
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzn(zzldVar.zzf);
                    }
                });
                if (zzhzVar2 != null) {
                    zzdrVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzit
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            int i27 = zzjs.zzd;
                            ((zzay) obj10).zzm(zzldVar.zzf);
                        }
                    });
                }
            }
            zzynVar = zzldVar2.zzi;
            zzynVar2 = zzldVar.zzi;
            if (zzynVar != zzynVar2) {
                this.zzj.zzp(zzynVar2.zze);
                this.zzn.zzd(2, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzd(zzldVar.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzam zzamVar = this.zzK;
                this.zzn.zzd(14, new zzdm() { // from class: com.google.android.gms.internal.ads.zziv
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zze(zzamVar);
                    }
                });
            }
            if (i18 != 0) {
                this.zzn.zzd(i10, new zzdm() { // from class: com.google.android.gms.internal.ads.zziw
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzf(zzldVar.zzg);
                    }
                });
            }
            if (i17 == 0 || i16 != 0) {
                this.zzn.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzix
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        zzld zzldVar4 = zzldVar;
                        ((zzay) obj10).zzh(zzldVar4.zzl, zzldVar4.zze);
                    }
                });
            }
            if (i17 != 0) {
                this.zzn.zzd(4, new zzdm() { // from class: com.google.android.gms.internal.ads.zziy
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzi(zzldVar.zze);
                    }
                });
            }
            if (i16 == 0 || zzldVar2.zzm != zzldVar.zzm) {
                this.zzn.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziz
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        zzld zzldVar4 = zzldVar;
                        ((zzay) obj10).zzj(zzldVar4.zzl, zzldVar4.zzm);
                    }
                });
            }
            if (zzldVar2.zzn != zzldVar.zzn) {
                this.zzn.zzd(6, new zzdm() { // from class: com.google.android.gms.internal.ads.zzja
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzk(zzldVar.zzn);
                    }
                });
            }
            if (zzldVar2.zzj() != zzldVar.zzj()) {
                this.zzn.zzd(7, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjb
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzl(zzldVar.zzj());
                    }
                });
            }
            if (!zzldVar2.zzo.equals(zzldVar.zzo)) {
                this.zzn.zzd(12, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        int i27 = zzjs.zzd;
                        ((zzay) obj10).zzp(zzldVar.zzo);
                    }
                });
            }
            zzawVar = this.zzJ;
            zzba zzbaVar = this.zzg;
            zzaw zzawVar2 = this.zzc;
            String str2 = zzeo.zza;
            zZzv = zzbaVar.zzv();
            zzeVar = (zze) zzbaVar;
            zzbeVarZzo2 = zzeVar.zzo();
            if (zzbeVarZzo2.zzg() && zzbeVarZzo2.zzb(zzeVar.zzq(), zzeVar.zza, 0L).zzh) {
                z12 = true;
            } else {
                z12 = false;
            }
            zzbeVarZzo3 = zzeVar.zzo();
            if (zzbeVarZzo3.zzg()) {
                i19 = -1;
                r15 = 0;
                z13 = false;
            } else {
                int iZzq3 = zzeVar.zzq();
                zzeVar.zzk();
                zzeVar.zzl();
                r15 = 0;
                r15 = 0;
                iZzi = zzbeVarZzo3.zzi(iZzq3, 0, false);
                i19 = -1;
                if (iZzi != -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            Zzo = zzeVar.zzo();
            if (Zzo.zzg()) {
                r7 = r15;
            } else {
                iZzq = zzeVar.zzq();
                zzeVar.zzk();
                zzeVar.zzl();
                if (Zzo.zzh(iZzq, r15, r15) != i19) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
            }
            zzbeVarZzo4 = zzeVar.zzo();
            if (!zzbeVarZzo4.zzg()) {
                z14 = zZzv;
                j8 = 0;
                if (zzbeVarZzo4.zzb(zzeVar.zzq(), zzeVar.zza, 0L).zzb()) {
                    r12 = 1;
                }
                zzbeVarZzo5 = zzeVar.zzo();
                if (zzbeVarZzo5.zzg() && zzbeVarZzo5.zzb(zzeVar.zzq(), zzeVar.zza, j8).zzi) {
                    r9 = 1;
                } else {
                    r9 = r15;
                }
                zZzg = zzbaVar.zzo().zzg();
                ?? zzavVar = new zzav();
                zzavVar.zzd(zzawVar2);
                boolean z15 = !z14;
                zzavVar.zzb(4, z15);
                if (z12 || z14) {
                    r8 = r15;
                } else {
                    r8 = 1;
                }
                zzavVar.zzb(5, r8);
                if (z13 || z14) {
                    r10 = r15;
                } else {
                    r10 = 1;
                }
                zzavVar.zzb(6, r10);
                if (!zZzg || (!(z13 || r12 == 0 || z12) || z14)) {
                    r11 = r15;
                } else {
                    r11 = 1;
                }
                zzavVar.zzb(7, r11);
                if (r7 != 0 || z14) {
                    r13 = r15;
                } else {
                    r13 = 1;
                }
                zzavVar.zzb(8, r13);
                if (!zZzg || ((r7 == 0 && (r12 == 0 || r9 == 0)) || z14)) {
                    r14 = r15;
                } else {
                    r14 = 1;
                }
                zzavVar.zzb(9, r14);
                zzavVar.zzb(10, z15);
                if (z12 || z14) {
                    r16 = r15;
                } else {
                    r16 = 1;
                }
                zzavVar.zzb(11, r16);
                if (z12 || z14) {
                    r17 = r15;
                } else {
                    r17 = 1;
                }
                zzavVar.zzb(12, r17);
                zzawVarZze = zzavVar.zze();
                this.zzJ = zzawVarZze;
                if (!zzawVarZze.equals(zzawVar)) {
                    this.zzn.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final /* synthetic */ void zza(Object obj10) {
                            this.zza.zzL((zzay) obj10);
                        }
                    });
                }
                this.zzn.zze();
            }
            z14 = zZzv;
            j8 = 0;
            r12 = r15;
            zzbeVarZzo5 = zzeVar.zzo();
            if (zzbeVarZzo5.zzg()) {
                r9 = r15;
            } else {
                r9 = r15;
            }
            zZzg = zzbaVar.zzo().zzg();
            ?? zzavVar2 = new zzav();
            zzavVar2.zzd(zzawVar2);
            boolean z16 = !z14;
            zzavVar2.zzb(4, z16);
            if (z12) {
                r8 = r15;
            } else {
                r8 = r15;
            }
            zzavVar2.zzb(5, r8);
            if (z13) {
                r10 = r15;
            } else {
                r10 = r15;
            }
            zzavVar2.zzb(6, r10);
            if (zZzg) {
                r11 = r15;
            } else {
                r11 = r15;
            }
            zzavVar2.zzb(7, r11);
            if (r7 != 0) {
                r13 = r15;
            } else {
                r13 = r15;
            }
            zzavVar2.zzb(8, r13);
            if (zZzg) {
                r14 = r15;
            } else {
                r14 = r15;
            }
            zzavVar2.zzb(9, r14);
            zzavVar2.zzb(10, z16);
            if (z12) {
                r16 = r15;
            } else {
                r16 = r15;
            }
            zzavVar2.zzb(11, r16);
            if (z12) {
                r17 = r15;
            } else {
                r17 = r15;
            }
            zzavVar2.zzb(12, r17);
            zzawVarZze = zzavVar2.zze();
            this.zzJ = zzawVarZze;
            if (!zzawVarZze.equals(zzawVar)) {
                this.zzn.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj10) {
                        this.zza.zzL((zzay) obj10);
                    }
                });
            }
            this.zzn.zze();
        }
        i10 = 3;
        pair2 = new Pair(Boolean.FALSE, -1);
        pair = pair2;
        i11 = 0;
        z10 = z7;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzbeVar.zzg()) {
                zzajVar = zzbeVar.zzb(zzbeVar.zzo(zzldVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
            } else {
                zzajVar = null;
            }
            this.zzV = zzam.zza;
        } else {
            zzajVar = null;
        }
        if (zBooleanValue) {
            zzalVarZza = this.zzV.zza();
            list = zzldVar.zzj;
            while (i14 < list.size()) {
                zzaoVar = (zzao) list.get(i14);
                while (i15 < zzaoVar.zza()) {
                    zzaoVar.zzb(i15).zza(zzalVarZza);
                }
            }
            this.zzV = zzalVarZza.zzw();
        } else {
            zzalVarZza = this.zzV.zza();
            list = zzldVar.zzj;
            while (i14 < list.size()) {
                zzaoVar = (zzao) list.get(i14);
                while (i15 < zzaoVar.zza()) {
                    zzaoVar.zzb(i15).zza(zzalVarZza);
                }
            }
            this.zzV = zzalVarZza.zzw();
        }
        zzbeVarZzo = zzo();
        if (zzbeVarZzo.zzg()) {
            zzamVarZzw = this.zzV;
        } else {
            zzaj zzajVar5 = zzbeVarZzo.zzb(zzq(), this.zza, 0L).zzd;
            zzal zzalVarZza3 = this.zzV.zza();
            zzalVarZza3.zzv(zzajVar5.zzd);
            zzamVarZzw = zzalVarZza3.zzw();
        }
        zEquals = zzamVarZzw.equals(this.zzK);
        this.zzK = zzamVarZzw;
        if (zzldVar2.zzl != zzldVar.zzl) {
            i16 = 1;
        } else {
            i16 = i11;
        }
        if (zzldVar2.zze != zzldVar.zze) {
            i17 = 1;
        } else {
            i17 = i11;
        }
        if (i17 == 0) {
            zzak();
        } else {
            zzak();
        }
        if (zzldVar2.zzg != zzldVar.zzg) {
            i18 = 1;
        } else {
            i18 = i11;
        }
        if (!zEquals2) {
            this.zzn.zzd(i11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjl
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj10) {
                    int i27 = zzjs.zzd;
                    ((zzay) obj10).zzb(zzldVar.zza, i7);
                }
            });
        }
        if (z10) {
            zzbcVar = new zzbc();
            if (r18.zzg()) {
                Object obj10 = zzldVar2.zzb.zza;
                r18.zzo(obj10, zzbcVar);
                int i27 = zzbcVar.zzc;
                int iZze3 = r18.zze(obj10);
                zzbd zzbdVar4 = this.zza;
                obj = r18.zzb(i27, zzbdVar4, 0L).zzb;
                zzajVar2 = zzbdVar4.zzd;
                obj2 = obj10;
                i20 = i27;
                i21 = iZze3;
            } else {
                i20 = i9;
                obj = null;
                zzajVar2 = null;
                obj2 = null;
                i21 = -1;
            }
            if (i23 == 0) {
                zzupVar = zzldVar2.zzb;
                if (zzupVar.zzb()) {
                    jZzac = zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc);
                    jZzac2 = zzac(zzldVar2);
                } else {
                    if (zzupVar.zze != -1) {
                        jZzac = zzac(this.zzW);
                    } else {
                        jZzac = zzbcVar.zzd;
                    }
                    jZzac2 = jZzac;
                }
            } else if (zzldVar2.zzb.zzb()) {
                jZzac = zzldVar2.zzs;
                jZzac2 = zzac(zzldVar2);
            } else {
                jZzac = zzldVar2.zzs;
                jZzac2 = jZzac;
            }
            String str3 = zzeo.zza;
            zzup zzupVar6 = zzldVar2.zzb;
            final zzaz zzazVar3 = new zzaz(obj, i20, zzajVar2, obj2, i21, zzeo.zzp(jZzac), zzeo.zzp(jZzac2), zzupVar6.zzb, zzupVar6.zzc);
            iZzq2 = zzq();
            if (this.zzW.zza.zzg()) {
                zzld zzldVar4 = this.zzW;
                Object obj11 = zzldVar4.zzb.zza;
                zzldVar4.zza.zzo(obj11, this.zzp);
                int iZze4 = this.zzW.zza.zze(obj11);
                zzbe zzbeVar3 = this.zzW.zza;
                zzbd zzbdVar5 = this.zza;
                Object obj12 = zzbeVar3.zzb(iZzq2, zzbdVar5, 0L).zzb;
                i22 = iZze4;
                zzajVar3 = zzbdVar5.zzd;
                obj3 = obj12;
                obj4 = obj11;
            } else {
                obj3 = null;
                zzajVar3 = null;
                obj4 = null;
                i22 = -1;
            }
            jZzp = zzeo.zzp(j7);
            if (this.zzW.zzb.zzb()) {
                jZzp2 = zzeo.zzp(zzac(this.zzW));
            } else {
                jZzp2 = jZzp;
            }
            zzup zzupVar7 = this.zzW.zzb;
            final zzaz zzazVar4 = new zzaz(obj3, iZzq2, zzajVar3, obj4, i22, jZzp, jZzp2, zzupVar7.zzb, zzupVar7.zzc);
            this.zzn.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzo(zzazVar3, zzazVar4, i23);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            i16 = i16;
            zEquals = zEquals;
        }
        if (zBooleanValue) {
            this.zzn.zzd(1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjn
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzc(zzajVar, iIntValue);
                }
            });
        }
        zzhzVar = zzldVar2.zzf;
        zzhzVar2 = zzldVar.zzf;
        if (zzhzVar != zzhzVar2) {
            zzdrVar = this.zzn;
            zzdrVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjo
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzn(zzldVar.zzf);
                }
            });
            if (zzhzVar2 != null) {
                zzdrVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzit
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj13) {
                        int i28 = zzjs.zzd;
                        ((zzay) obj13).zzm(zzldVar.zzf);
                    }
                });
            }
        }
        zzynVar = zzldVar2.zzi;
        zzynVar2 = zzldVar.zzi;
        if (zzynVar != zzynVar2) {
            this.zzj.zzp(zzynVar2.zze);
            this.zzn.zzd(2, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzd(zzldVar.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzam zzamVar2 = this.zzK;
            this.zzn.zzd(14, new zzdm() { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zze(zzamVar2);
                }
            });
        }
        if (i18 != 0) {
            this.zzn.zzd(i10, new zzdm() { // from class: com.google.android.gms.internal.ads.zziw
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzf(zzldVar.zzg);
                }
            });
        }
        if (i17 == 0) {
            this.zzn.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzix
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    zzld zzldVar5 = zzldVar;
                    ((zzay) obj13).zzh(zzldVar5.zzl, zzldVar5.zze);
                }
            });
        } else {
            this.zzn.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzix
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    zzld zzldVar5 = zzldVar;
                    ((zzay) obj13).zzh(zzldVar5.zzl, zzldVar5.zze);
                }
            });
        }
        if (i17 != 0) {
            this.zzn.zzd(4, new zzdm() { // from class: com.google.android.gms.internal.ads.zziy
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzi(zzldVar.zze);
                }
            });
        }
        if (i16 == 0) {
            this.zzn.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    zzld zzldVar5 = zzldVar;
                    ((zzay) obj13).zzj(zzldVar5.zzl, zzldVar5.zzm);
                }
            });
        } else {
            this.zzn.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziz
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    zzld zzldVar5 = zzldVar;
                    ((zzay) obj13).zzj(zzldVar5.zzl, zzldVar5.zzm);
                }
            });
        }
        if (zzldVar2.zzn != zzldVar.zzn) {
            this.zzn.zzd(6, new zzdm() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzk(zzldVar.zzn);
                }
            });
        }
        if (zzldVar2.zzj() != zzldVar.zzj()) {
            this.zzn.zzd(7, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzl(zzldVar.zzj());
                }
            });
        }
        if (!zzldVar2.zzo.equals(zzldVar.zzo)) {
            this.zzn.zzd(12, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    int i28 = zzjs.zzd;
                    ((zzay) obj13).zzp(zzldVar.zzo);
                }
            });
        }
        zzawVar = this.zzJ;
        zzba zzbaVar2 = this.zzg;
        zzaw zzawVar3 = this.zzc;
        String str4 = zzeo.zza;
        zZzv = zzbaVar2.zzv();
        zzeVar = (zze) zzbaVar2;
        zzbeVarZzo2 = zzeVar.zzo();
        if (zzbeVarZzo2.zzg()) {
            z12 = false;
        } else {
            z12 = false;
        }
        zzbeVarZzo3 = zzeVar.zzo();
        if (zzbeVarZzo3.zzg()) {
            i19 = -1;
            r15 = 0;
            z13 = false;
        } else {
            int iZzq4 = zzeVar.zzq();
            zzeVar.zzk();
            zzeVar.zzl();
            r15 = 0;
            r15 = 0;
            iZzi = zzbeVarZzo3.zzi(iZzq4, 0, false);
            i19 = -1;
            if (iZzi != -1) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        Zzo = zzeVar.zzo();
        if (Zzo.zzg()) {
            r7 = r15;
        } else {
            iZzq = zzeVar.zzq();
            zzeVar.zzk();
            zzeVar.zzl();
            if (Zzo.zzh(iZzq, r15, r15) != i19) {
                r7 = 1;
            } else {
                r7 = r15;
            }
        }
        zzbeVarZzo4 = zzeVar.zzo();
        if (!zzbeVarZzo4.zzg()) {
            z14 = zZzv;
            j8 = 0;
            if (zzbeVarZzo4.zzb(zzeVar.zzq(), zzeVar.zza, 0L).zzb()) {
                r12 = 1;
            }
            zzbeVarZzo5 = zzeVar.zzo();
            if (zzbeVarZzo5.zzg()) {
                r9 = r15;
            } else {
                r9 = r15;
            }
            zZzg = zzbaVar2.zzo().zzg();
            ?? zzavVar3 = new zzav();
            zzavVar3.zzd(zzawVar3);
            boolean z17 = !z14;
            zzavVar3.zzb(4, z17);
            if (z12) {
                r8 = r15;
            } else {
                r8 = r15;
            }
            zzavVar3.zzb(5, r8);
            if (z13) {
                r10 = r15;
            } else {
                r10 = r15;
            }
            zzavVar3.zzb(6, r10);
            if (zZzg) {
                r11 = r15;
            } else {
                r11 = r15;
            }
            zzavVar3.zzb(7, r11);
            if (r7 != 0) {
                r13 = r15;
            } else {
                r13 = r15;
            }
            zzavVar3.zzb(8, r13);
            if (zZzg) {
                r14 = r15;
            } else {
                r14 = r15;
            }
            zzavVar3.zzb(9, r14);
            zzavVar3.zzb(10, z17);
            if (z12) {
                r16 = r15;
            } else {
                r16 = r15;
            }
            zzavVar3.zzb(11, r16);
            if (z12) {
                r17 = r15;
            } else {
                r17 = r15;
            }
            zzavVar3.zzb(12, r17);
            zzawVarZze = zzavVar3.zze();
            this.zzJ = zzawVarZze;
            if (!zzawVarZze.equals(zzawVar)) {
                this.zzn.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final /* synthetic */ void zza(Object obj13) {
                        this.zza.zzL((zzay) obj13);
                    }
                });
            }
            this.zzn.zze();
        }
        z14 = zZzv;
        j8 = 0;
        r12 = r15;
        zzbeVarZzo5 = zzeVar.zzo();
        if (zzbeVarZzo5.zzg()) {
            r9 = r15;
        } else {
            r9 = r15;
        }
        zZzg = zzbaVar2.zzo().zzg();
        ?? zzavVar4 = new zzav();
        zzavVar4.zzd(zzawVar3);
        boolean z18 = !z14;
        zzavVar4.zzb(4, z18);
        if (z12) {
            r8 = r15;
        } else {
            r8 = r15;
        }
        zzavVar4.zzb(5, r8);
        if (z13) {
            r10 = r15;
        } else {
            r10 = r15;
        }
        zzavVar4.zzb(6, r10);
        if (zZzg) {
            r11 = r15;
        } else {
            r11 = r15;
        }
        zzavVar4.zzb(7, r11);
        if (r7 != 0) {
            r13 = r15;
        } else {
            r13 = r15;
        }
        zzavVar4.zzb(8, r13);
        if (zZzg) {
            r14 = r15;
        } else {
            r14 = r15;
        }
        zzavVar4.zzb(9, r14);
        zzavVar4.zzb(10, z18);
        if (z12) {
            r16 = r15;
        } else {
            r16 = r15;
        }
        zzavVar4.zzb(11, r16);
        if (z12) {
            r17 = r15;
        } else {
            r17 = r15;
        }
        zzavVar4.zzb(12, r17);
        zzawVarZze = zzavVar4.zze();
        this.zzJ = zzawVarZze;
        if (!zzawVarZze.equals(zzawVar)) {
            this.zzn.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzdm
                public final /* synthetic */ void zza(Object obj13) {
                    this.zza.zzL((zzay) obj13);
                }
            });
        }
        this.zzn.zze();
    }

    private static long zzac(zzld zzldVar) {
        zzbd zzbdVar = new zzbd();
        zzbc zzbcVar = new zzbc();
        zzbe zzbeVar = zzldVar.zza;
        zzbeVar.zzo(zzldVar.zzb.zza, zzbcVar);
        long j7 = zzldVar.zzc;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j8 = zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L).zzl;
        return 0L;
    }

    private final zzld zzad(zzld zzldVar, zzbe zzbeVar, Pair pair) {
        zzghc.zza(zzbeVar.zzg() || pair != null);
        zzbe zzbeVar2 = zzldVar.zza;
        long jZzZ = zzZ(zzldVar);
        zzld zzldVarZzd = zzldVar.zzd(zzbeVar);
        if (zzbeVar.zzg()) {
            zzup zzupVarZzb = zzld.zzb();
            long jZzq = zzeo.zzq(this.zzY);
            zzld zzldVarZzh = zzldVarZzd.zzc(zzupVarZzb, jZzq, jZzq, jZzq, 0L, zzwq.zza, this.zzb, zzgjz.zzi()).zzh(zzupVarZzb);
            zzldVarZzh.zzq = zzldVarZzh.zzs;
            return zzldVarZzh;
        }
        zzup zzupVar = zzldVarZzd.zzb;
        Object obj = zzupVar.zza;
        String str = zzeo.zza;
        boolean zEquals = obj.equals(pair.first);
        zzup zzupVar2 = !zEquals ? new zzup(pair.first, -1L) : zzupVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzq2 = zzeo.zzq(jZzZ);
        if (!zzbeVar2.zzg()) {
            zzbeVar2.zzo(obj, this.zzp);
        }
        if (!zEquals || jLongValue < jZzq2) {
            zzup zzupVar3 = zzupVar2;
            zzghc.zzh(!zzupVar3.zzb());
            zzld zzldVarZzh2 = zzldVarZzd.zzc(zzupVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzwq.zza : zzldVarZzd.zzh, !zEquals ? this.zzb : zzldVarZzd.zzi, !zEquals ? zzgjz.zzi() : zzldVarZzd.zzj).zzh(zzupVar3);
            zzldVarZzh2.zzq = jLongValue;
            return zzldVarZzh2;
        }
        if (jLongValue != jZzq2) {
            zzup zzupVar4 = zzupVar2;
            zzghc.zzh(!zzupVar4.zzb());
            long jMax = Math.max(0L, zzldVarZzd.zzr - (jLongValue - jZzq2));
            long j7 = zzldVarZzd.zzq;
            if (zzldVarZzd.zzk.equals(zzupVar)) {
                j7 = jLongValue + jMax;
            }
            zzld zzldVarZzc = zzldVarZzd.zzc(zzupVar4, jLongValue, jLongValue, jLongValue, jMax, zzldVarZzd.zzh, zzldVarZzd.zzi, zzldVarZzd.zzj);
            zzldVarZzc.zzq = j7;
            return zzldVarZzc;
        }
        int iZze = zzbeVar.zze(zzldVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbc zzbcVar = this.zzp;
            if (zzbeVar.zzd(iZze, zzbcVar, false).zzc == zzbeVar.zzo(zzupVar2.zza, zzbcVar).zzc) {
                return zzldVarZzd;
            }
        }
        Object obj2 = zzupVar2.zza;
        zzbc zzbcVar2 = this.zzp;
        zzbeVar.zzo(obj2, zzbcVar2);
        long jZzh = zzupVar2.zzb() ? zzbcVar2.zzh(zzupVar2.zzb, zzupVar2.zzc) : zzbcVar2.zzd;
        zzup zzupVar5 = zzupVar2;
        zzld zzldVarZzh3 = zzldVarZzd.zzc(zzupVar5, zzldVarZzd.zzs, zzldVarZzd.zzs, zzldVarZzd.zzd, jZzh - zzldVarZzd.zzs, zzldVarZzd.zzh, zzldVarZzd.zzi, zzldVarZzd.zzj).zzh(zzupVar5);
        zzldVarZzh3.zzq = jZzh;
        return zzldVarZzh3;
    }

    private static zzld zzae(zzld zzldVar, int i7) {
        zzld zzldVarZze = zzldVar.zze(i7);
        return (i7 == 1 || i7 == 4) ? zzldVarZze.zzg(false) : zzldVarZze;
    }

    private final Pair zzaf(zzbe zzbeVar, int i7, long j7) {
        if (zzbeVar.zzg()) {
            this.zzX = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.zzY = j7;
            return null;
        }
        if (i7 == -1 || i7 >= zzbeVar.zza()) {
            i7 = zzbeVar.zzk(false);
            long j8 = zzbeVar.zzb(i7, this.zza, 0L).zzl;
            j7 = zzeo.zzp(0L);
        }
        return zzbeVar.zzm(this.zza, this.zzp, i7, zzeo.zzq(j7));
    }

    private final long zzag(zzbe zzbeVar, zzup zzupVar, long j7) {
        zzbeVar.zzo(zzupVar.zza, this.zzp);
        return j7;
    }

    private final zzlh zzah(zzlg zzlgVar) {
        int iZzY = zzY(this.zzW);
        zzbe zzbeVar = this.zzW.zza;
        if (iZzY == -1) {
            iZzY = 0;
        }
        zzdb zzdbVar = this.zzv;
        zzkf zzkfVar = this.zzm;
        return new zzlh(zzkfVar, zzlgVar, zzbeVar, iZzY, zzdbVar, zzkfVar.zzn());
    }

    private final void zzai(Object obj) {
        Object obj2 = this.zzL;
        boolean z7 = false;
        if (obj2 != null && obj2 != obj) {
            z7 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z7 ? this.zzA : -9223372036854775807L);
        if (z7) {
            Object obj3 = this.zzL;
            Surface surface = this.zzM;
            if (obj3 == surface) {
                surface.release();
                this.zzM = null;
            }
        }
        this.zzL = obj;
        if (zZzl) {
            return;
        }
        zzN(zzhz.zzc(new zzkg(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzQ(final int i7, final int i8) {
        if (i7 == this.zzO.zza() && i8 == this.zzO.zzb()) {
            return;
        }
        this.zzO = new zzeg(i7, i8);
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(24, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i9 = zzjs.zzd;
                ((zzay) obj).zzu(i7, i8);
            }
        });
        zzdrVar.zze();
        zzam(2, 14, new zzeg(i7, i8));
    }

    private final void zzak() {
        int iZzg = zzg();
        if (iZzg != 2 && iZzg != 3) {
            this.zzy.zza(false);
            this.zzz.zza(false);
        } else {
            zzal();
            boolean z7 = this.zzW.zzp;
            this.zzy.zza(zzj());
            this.zzz.zza(zzj());
        }
    }

    private final void zzal() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzeo.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzS) {
                throw new IllegalStateException(str2);
            }
            zzds.zzd("ExoPlayerImpl", str2, this.zzT ? null : new IllegalStateException());
            this.zzT = true;
        }
    }

    private final void zzam(int i7, int i8, Object obj) {
        zzll[] zzllVarArr = this.zzh;
        int length = zzllVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            zzll zzllVar = zzllVarArr[i9];
            if (i7 == -1 || zzllVar.zza() == i7) {
                zzlh zzlhVarZzah = zzah(zzllVar);
                zzlhVarZzah.zzb(i8);
                zzlhVarZzah.zzd(obj);
                zzlhVarZzah.zzg();
            }
        }
        zzll[] zzllVarArr2 = this.zzi;
        int length2 = zzllVarArr2.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzll zzllVar2 = zzllVarArr2[i10];
            if (zzllVar2 != null && (i7 == -1 || zzllVar2.zza() == i7)) {
                zzlh zzlhVarZzah2 = zzah(zzllVar2);
                zzlhVarZzah2.zzb(i8);
                zzlhVarZzah2.zzd(obj);
                zzlhVarZzah2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzA(Surface surface) {
        zzal();
        zzai(surface);
        int i7 = surface == null ? 0 : -1;
        zzQ(i7, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzB(zzmg zzmgVar) {
        this.zzs.zzv(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzC(zzmg zzmgVar) {
        zzal();
        this.zzs.zzw(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final int zzD() {
        zzal();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzE(zzur zzurVar) {
        zzal();
        List listSingletonList = Collections.singletonList(zzurVar);
        zzal();
        zzal();
        zzY(this.zzW);
        zzs();
        this.zzD++;
        List list = this.zzq;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                list.remove(i7);
            }
            this.zzZ = this.zzZ.zzg(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < listSingletonList.size(); i8++) {
            zzkz zzkzVar = new zzkz((zzur) listSingletonList.get(i8), this.zzr);
            arrayList.add(zzkzVar);
            list.add(i8, new zzjr(zzkzVar.zzb, zzkzVar.zza));
        }
        this.zzZ = this.zzZ.zzf(0, arrayList.size());
        zzlj zzljVar = new zzlj(list, this.zzZ);
        if (!zzljVar.zzg() && zzljVar.zza() < 0) {
            throw new zzv(zzljVar, -1, -9223372036854775807L);
        }
        int iZzk = zzljVar.zzk(false);
        zzld zzldVarZzad = zzad(this.zzW, zzljVar, zzaf(zzljVar, iZzk, -9223372036854775807L));
        int i9 = zzldVarZzad.zze;
        if (i9 == 1) {
            i9 = 1;
        } else if (zzljVar.zzg()) {
            i9 = 4;
        } else if (iZzk != -1) {
            if (iZzk >= zzljVar.zza()) {
                i9 = 4;
            } else {
                i9 = 2;
            }
        }
        zzld zzldVarZzae = zzae(zzldVarZzad, i9);
        this.zzm.zzy(arrayList, iZzk, zzeo.zzq(-9223372036854775807L), this.zzZ);
        zzab(zzldVarZzae, 0, (this.zzW.zzb.zza.equals(zzldVarZzae.zzb.zza) || this.zzW.zza.zzg()) ? false : true, 4, zzaa(zzldVarZzae), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzF() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeo.zza;
        String strZza = zzak.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.8.0] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strZza);
        sb.append("]");
        zzds.zzb("ExoPlayerImpl", sb.toString());
        zzal();
        this.zzy.zza(false);
        this.zzz.zza(false);
        this.zzC.zzv();
        if (!this.zzm.zzm()) {
            zzdr zzdrVar = this.zzn;
            zzdrVar.zzd(10, zzjj.zza);
            zzdrVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzl(null);
        zzyu zzyuVar = this.zzu;
        zzmd zzmdVar = this.zzs;
        zzyuVar.zzg(zzmdVar);
        zzld zzldVar = this.zzW;
        boolean z7 = zzldVar.zzp;
        zzld zzldVarZzae = zzae(zzldVar, 1);
        this.zzW = zzldVarZzae;
        zzld zzldVarZzh = zzldVarZzae.zzh(zzldVarZzae.zzb);
        this.zzW = zzldVarZzh;
        zzldVarZzh.zzq = zzldVarZzh.zzs;
        this.zzW.zzr = 0L;
        zzmdVar.zzy();
        Surface surface = this.zzM;
        if (surface != null) {
            surface.release();
            this.zzM = null;
        }
        int i7 = zzcn.zza;
    }

    public final zzhz zzG() {
        zzal();
        return this.zzW.zzf;
    }

    final /* synthetic */ void zzH(zzay zzayVar, zzr zzrVar) {
        zzayVar.zza(this.zzg, new zzax(zzrVar));
    }

    final /* synthetic */ void zzI(final zzkc zzkcVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM(zzkcVar);
            }
        });
    }

    final /* synthetic */ void zzJ(int i7, final int i8) {
        zzal();
        Integer numValueOf = Integer.valueOf(i8);
        zzam(1, 10, numValueOf);
        zzam(2, 10, numValueOf);
        zzdm zzdmVar = new zzdm() { // from class: com.google.android.gms.internal.ads.zzjg
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i9 = zzjs.zzd;
                ((zzay) obj).zzq(i8);
            }
        };
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(21, zzdmVar);
        zzdrVar.zze();
    }

    final /* synthetic */ void zzK() {
        String str = zzeo.zza;
        this.zzB.zzb(Integer.valueOf(zzca.zza(this.zzf).generateAudioSessionId()));
    }

    final /* synthetic */ void zzL(zzay zzayVar) {
        zzayVar.zzg(this.zzJ);
    }

    final /* synthetic */ void zzM(zzkc zzkcVar) {
        boolean z7;
        int i7 = this.zzD - zzkcVar.zzb;
        this.zzD = i7;
        boolean z8 = true;
        if (zzkcVar.zzc) {
            this.zzE = zzkcVar.zzd;
            this.zzF = true;
        }
        if (i7 == 0) {
            zzbe zzbeVar = zzkcVar.zza.zza;
            if (!this.zzW.zza.zzg() && zzbeVar.zzg()) {
                this.zzX = -1;
                this.zzY = 0L;
            }
            if (!zzbeVar.zzg()) {
                List listZzw = ((zzlj) zzbeVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzghc.zzh(size == list.size());
                for (int i8 = 0; i8 < listZzw.size(); i8++) {
                    ((zzjr) list.get(i8)).zzc((zzbe) listZzw.get(i8));
                }
            }
            long j7 = -9223372036854775807L;
            if (this.zzF) {
                if (zzkcVar.zza.zzb.equals(this.zzW.zzb) && zzkcVar.zza.zzd == this.zzW.zzs) {
                    z8 = false;
                }
                if (z8) {
                    if (zzbeVar.zzg() || zzkcVar.zza.zzb.zzb()) {
                        j7 = zzkcVar.zza.zzd;
                    } else {
                        zzld zzldVar = zzkcVar.zza;
                        zzup zzupVar = zzldVar.zzb;
                        long j8 = zzldVar.zzd;
                        zzag(zzbeVar, zzupVar, j8);
                        j7 = j8;
                    }
                }
                z7 = z8;
            } else {
                z7 = false;
            }
            this.zzF = false;
            zzab(zzkcVar.zza, 1, z7, this.zzE, j7, -1, false);
        }
    }

    final /* synthetic */ void zzO(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzai(surface);
        this.zzM = surface;
    }

    final /* synthetic */ void zzP(Object obj) {
        zzai(null);
    }

    final /* synthetic */ zzdr zzR() {
        return this.zzn;
    }

    final /* synthetic */ zzmd zzS() {
        return this.zzs;
    }

    final /* synthetic */ zzda zzT() {
        return this.zzB;
    }

    final /* synthetic */ Object zzU() {
        return this.zzL;
    }

    final /* synthetic */ boolean zzV() {
        return this.zzR;
    }

    final /* synthetic */ void zzW(boolean z7) {
        this.zzR = z7;
    }

    @Override // com.google.android.gms.internal.ads.zze
    protected final void zzb(int i7, long j7, int i8, boolean z7) {
        zzal();
        if (i7 == -1) {
            return;
        }
        zzghc.zza(i7 >= 0);
        zzbe zzbeVar = this.zzW.zza;
        if (zzbeVar.zzg() || i7 < zzbeVar.zza()) {
            this.zzs.zzA();
            this.zzD++;
            if (zzv()) {
                zzds.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkc zzkcVar = new zzkc(this.zzW);
                zzkcVar.zza(1);
                this.zzl.zza(zzkcVar);
                return;
            }
            zzld zzldVarZzae = this.zzW;
            int i9 = zzldVarZzae.zze;
            if (i9 == 3 || (i9 == 4 && !zzbeVar.zzg())) {
                zzldVarZzae = zzae(this.zzW, 2);
            }
            int iZzq = zzq();
            zzld zzldVarZzad = zzad(zzldVarZzae, zzbeVar, zzaf(zzbeVar, i7, j7));
            this.zzm.zzf(zzbeVar, i7, zzeo.zzq(j7));
            zzab(zzldVarZzad, 0, true, 1, zzaa(zzldVarZzad), iZzq, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final Looper zzc() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzd(zzay zzayVar) {
        zzayVar.getClass();
        this.zzn.zzb(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zze(zzay zzayVar) {
        zzal();
        this.zzn.zzc(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzf() {
        zzal();
        zzld zzldVar = this.zzW;
        if (zzldVar.zze != 1) {
            return;
        }
        zzld zzldVarZzf = zzldVar.zzf(null);
        zzld zzldVarZzae = zzae(zzldVarZzf, true != zzldVarZzf.zza.zzg() ? 2 : 4);
        this.zzD++;
        this.zzm.zzd();
        zzab(zzldVarZzae, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzg() {
        zzal();
        return this.zzW.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzh() {
        zzal();
        return this.zzW.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzi(boolean z7) {
        zzal();
        zzld zzldVar = this.zzW;
        int i7 = zzldVar.zzn;
        int i8 = 0;
        if (i7 == 1) {
            if (z7) {
                i7 = 1;
            } else {
                i7 = 1;
                i8 = 1;
            }
        }
        if (zzldVar.zzl == z7 && i7 == i8 && zzldVar.zzm == 1) {
            return;
        }
        this.zzD++;
        zzld zzldVarZzi = zzldVar.zzi(z7, 1, i8);
        this.zzm.zze(z7, 1, i8);
        zzab(zzldVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzj() {
        zzal();
        return this.zzW.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzk() {
        zzal();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzl() {
        zzal();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzm() {
        zzal();
        zzN(null);
        new zzcn(zzgjz.zzi(), this.zzW.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbm zzn() {
        zzal();
        return this.zzW.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbe zzo() {
        zzal();
        return this.zzW.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzp() {
        zzal();
        if (this.zzW.zza.zzg()) {
            return 0;
        }
        zzld zzldVar = this.zzW;
        return zzldVar.zza.zze(zzldVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzq() {
        zzal();
        int iZzY = zzY(this.zzW);
        if (iZzY == -1) {
            return 0;
        }
        return iZzY;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzr() {
        zzal();
        if (!zzv()) {
            zzbe zzbeVarZzo = zzo();
            if (zzbeVarZzo.zzg()) {
                return -9223372036854775807L;
            }
            return zzeo.zzp(zzbeVarZzo.zzb(zzq(), this.zza, 0L).zzm);
        }
        zzld zzldVar = this.zzW;
        zzup zzupVar = zzldVar.zzb;
        zzbe zzbeVar = zzldVar.zza;
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zzp;
        zzbeVar.zzo(obj, zzbcVar);
        return zzeo.zzp(zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzs() {
        zzal();
        return zzeo.zzp(zzaa(this.zzW));
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzt() {
        zzal();
        if (zzv()) {
            zzld zzldVar = this.zzW;
            return zzldVar.zzk.equals(zzldVar.zzb) ? zzeo.zzp(this.zzW.zzq) : zzr();
        }
        zzal();
        if (this.zzW.zza.zzg()) {
            return this.zzY;
        }
        zzld zzldVar2 = this.zzW;
        long j7 = 0;
        if (zzldVar2.zzk.zzd != zzldVar2.zzb.zzd) {
            return zzeo.zzp(zzldVar2.zza.zzb(zzq(), this.zza, 0L).zzm);
        }
        long j8 = zzldVar2.zzq;
        if (this.zzW.zzk.zzb()) {
            zzld zzldVar3 = this.zzW;
            zzldVar3.zza.zzo(zzldVar3.zzk.zza, this.zzp).zzc(this.zzW.zzk.zzb);
        } else {
            j7 = j8;
        }
        zzld zzldVar4 = this.zzW;
        zzag(zzldVar4.zza, zzldVar4.zzk, j7);
        return zzeo.zzp(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzu() {
        zzal();
        return zzeo.zzp(this.zzW.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzv() {
        zzal();
        return this.zzW.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzw() {
        zzal();
        if (zzv()) {
            return this.zzW.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzx() {
        zzal();
        if (zzv()) {
            return this.zzW.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzy() {
        zzal();
        return zzZ(this.zzW);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzz(float f7) {
        zzal();
        String str = zzeo.zza;
        final float fMax = Math.max(0.0f, Math.min(f7, 1.0f));
        if (this.zzQ == fMax) {
            return;
        }
        this.zzQ = fMax;
        this.zzm.zzj(fMax);
        zzdr zzdrVar = this.zzn;
        zzdrVar.zzd(22, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                int i7 = zzjs.zzd;
                ((zzay) obj).zzr(fMax);
            }
        });
        zzdrVar.zze();
    }
}
