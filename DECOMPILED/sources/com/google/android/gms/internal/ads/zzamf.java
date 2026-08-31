package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamf implements zzamd {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzaeb zzb;
    private final zzanv zzd;
    private final String zze;
    private final zzef zzf;
    private final zzamu zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzame zzi = new zzame(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzamf(zzanv zzanvVar, String str) {
        zzef zzefVar;
        this.zzd = zzanvVar;
        this.zze = str;
        if (zzanvVar != null) {
            this.zzg = new zzamu(178, 128);
            zzefVar = new zzef();
        } else {
            zzefVar = null;
            this.zzg = null;
        }
        this.zzf = zzefVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        zzfl.zzi(this.zzh);
        this.zzi.zza();
        zzamu zzamuVar = this.zzg;
        if (zzamuVar != null) {
            zzamuVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zza = zzanrVar.zzc();
        this.zzb = zzacxVar.zzu(zzanrVar.zzb(), 2);
        zzanv zzanvVar = this.zzd;
        if (zzanvVar != null) {
            zzanvVar.zza(zzacxVar, zzanrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j7, int i7) {
        this.zzn = j7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
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
    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        char c7;
        boolean z7;
        boolean z8;
        int i7;
        float f7;
        int i8;
        int i9;
        char c8 = 3;
        this.zzb.getClass();
        int iZzg = zzefVar.zzg();
        int iZze = zzefVar.zze();
        byte[] bArrZzi = zzefVar.zzi();
        this.zzj += (long) zzefVar.zzd();
        this.zzb.zzz(zzefVar, zzefVar.zzd());
        while (true) {
            int iZzh = zzfl.zzh(bArrZzi, iZzg, iZze, this.zzh);
            if (iZzh == iZze) {
                break;
            }
            int i10 = iZzh + 3;
            int i11 = zzefVar.zzi()[i10] & 255;
            int i12 = iZzh - iZzg;
            if (this.zzl) {
                c7 = c8;
            } else {
                if (i12 > 0) {
                    this.zzi.zzc(bArrZzi, iZzg, iZzh);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                zzame zzameVar = this.zzi;
                if (zzameVar.zzb(i11, i13)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzameVar.zzc, zzameVar.zza);
                    int i14 = bArrCopyOf[4] & 255;
                    byte b7 = bArrCopyOf[5];
                    int i15 = bArrCopyOf[6] & 255;
                    int i16 = (i14 << 4) | ((b7 & 255) >> 4);
                    int i17 = (bArrCopyOf[7] & 240) >> 4;
                    int i18 = ((b7 & 15) << 8) | i15;
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 != 4) {
                                f7 = 1.0f;
                            } else {
                                i8 = i18 * 121;
                                i9 = i16 * 100;
                            }
                            c7 = 3;
                        } else {
                            i8 = i18 * 16;
                            i9 = i16 * 9;
                        }
                        f7 = i8 / i9;
                        c7 = 3;
                    } else {
                        c7 = 3;
                        f7 = (i18 * 4) / (i16 * 3);
                    }
                    zzs zzsVar = new zzs();
                    zzsVar.zza(str);
                    zzsVar.zzl(str2);
                    zzsVar.zzm("video/mpeg2");
                    zzsVar.zzt(i16);
                    zzsVar.zzu(i18);
                    zzsVar.zzz(f7);
                    zzsVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzu zzuVarZzM = zzsVar.zzM();
                    int i19 = (bArrCopyOf[7] & 15) - 1;
                    long j7 = 0;
                    if (i19 >= 0 && i19 < 8) {
                        double d7 = zzc[i19];
                        byte b8 = bArrCopyOf[zzameVar.zzb + 9];
                        int i20 = (b8 & 96) >> 5;
                        int i21 = b8 & 31;
                        if (i20 != i21) {
                            d7 *= (((double) i20) + 1.0d) / ((double) (i21 + 1));
                        }
                        j7 = (long) (1000000.0d / d7);
                    }
                    Pair pairCreate = Pair.create(zzuVarZzM, Long.valueOf(j7));
                    this.zzb.zzu((zzu) pairCreate.first);
                    this.zzm = ((Long) pairCreate.second).longValue();
                    this.zzl = true;
                } else {
                    c7 = c8;
                }
            }
            zzamu zzamuVar = this.zzg;
            if (zzamuVar != null) {
                if (i12 > 0) {
                    zzamuVar.zzd(bArrZzi, iZzg, iZzh);
                    i7 = 0;
                } else {
                    i7 = -i12;
                }
                if (zzamuVar.zze(i7)) {
                    int iZza = zzfl.zza(zzamuVar.zza, zzamuVar.zzb);
                    zzef zzefVar2 = this.zzf;
                    String str3 = zzeo.zza;
                    zzefVar2.zzb(zzamuVar.zza, iZza);
                    this.zzd.zzb(this.zzp, zzefVar2);
                }
                if (i11 == 178) {
                    if (zzefVar.zzi()[iZzh + 2] == 1) {
                        zzamuVar.zzc(178);
                    }
                    i11 = 178;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i22 = iZze - iZzh;
                if (this.zzr && this.zzl) {
                    long j8 = this.zzp;
                    if (j8 != -9223372036854775807L) {
                        this.zzb.zzx(j8, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i22, i22, null);
                    }
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i22);
                    long j9 = this.zzn;
                    if (j9 == -9223372036854775807L) {
                        long j10 = this.zzp;
                        j9 = j10 != -9223372036854775807L ? j10 + this.zzm : -9223372036854775807L;
                    }
                    this.zzp = j9;
                    z7 = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z8 = true;
                    this.zzk = true;
                } else {
                    z7 = false;
                    z8 = true;
                }
                this.zzr = i11 == 0 ? z8 : z7;
            } else if (i11 == 184) {
                this.zzq = true;
            }
            iZzg = i10;
            c8 = c7;
        }
        if (!this.zzl) {
            this.zzi.zzc(bArrZzi, iZzg, iZze);
        }
        zzamu zzamuVar2 = this.zzg;
        if (zzamuVar2 != null) {
            zzamuVar2.zzd(bArrZzi, iZzg, iZze);
        }
    }

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
    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z7) {
        zzaeb zzaebVar = this.zzb;
        zzaebVar.getClass();
        if (z7) {
            boolean z8 = this.zzq;
            long j7 = this.zzj - this.zzo;
            zzaebVar.zzx(this.zzp, z8 ? 1 : 0, (int) j7, 0, null);
        }
    }
}
