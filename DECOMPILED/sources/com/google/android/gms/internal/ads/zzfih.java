package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfih extends zzhih implements zzhjt {
    private static final zzfih zzaw;
    private static volatile zzhka zzax;
    private int zzD;
    private int zzE;
    private int zzF;
    private long zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private int zzK;
    private int zzR;
    private int zzS;
    private int zzU;
    private int zza;
    private long zzae;
    private int zzag;
    private int zzah;
    private int zzai;
    private zzfjg zzaj;
    private int zzak;
    private zzfjc zzal;
    private zzfin zzam;
    private zzfir zzan;
    private zzfip zzao;
    private zzfje zzap;
    private zzfiy zzaq;
    private zzfiu zzar;
    private zzhlz zzas;
    private zzfji zzau;
    private zzfiw zzav;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzz;
    private String zzd = "";
    private zzhip zzh = zzhih.zzbC();
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzA = "";
    private String zzB = "";
    private zzhis zzC = zzhih.zzbE();
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzT = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzaf = "";
    private String zzat = "";

    static {
        zzfih zzfihVar = new zzfih();
        zzaw = zzfihVar;
        zzhih.zzbu(zzfih.class, zzfihVar);
    }

    private zzfih() {
    }

    public static zzfif zza() {
        return (zzfif) zzaw.zzbn();
    }

    final /* synthetic */ void zzA(int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzD = i7 - 2;
    }

    final /* synthetic */ void zzB(int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzK = i7 - 2;
    }

    final /* synthetic */ void zzb(boolean z7) {
        this.zzi = z7;
    }

    final /* synthetic */ void zzc(long j7) {
        this.zzj = j7;
    }

    final /* synthetic */ void zzd(long j7) {
        this.zzk = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzaw, "\u0004E\u0000\u0001\u0001EE\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\n", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzw", "zzy", "zzz", "zzD", "zzF", "zzG", "zzK", "zzL", "zzM", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzp", "zzu", "zzA", "zzB", "zzC", "zzN", "zzO", "zzW", "zzae", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzah", "zzai", "zzc", "zzal", "zzam", "zzR", "zzT", "zzQ", "zzP", "zzak", "zzS", "zzU", "zzV", "zzx", "zzan", "zzE", "zzao", "zzaf", "zzag", "zzaj", "zzap", "zzaq", "zzX", "zzar", "zzas", "zzat", "zzv", "zzau", "zzH", "zzI", "zzJ", "zzav"});
        }
        if (iOrdinal == 3) {
            return new zzfih();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfif(bArr);
        }
        if (iOrdinal == 5) {
            return zzaw;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzax;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfih.class) {
            try {
                zzhicVar = zzax;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzaw);
                    zzax = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzo = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzw = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zzy = str;
    }

    final /* synthetic */ void zzi(int i7) {
        this.zzz = i7;
    }

    final /* synthetic */ void zzj(Iterable iterable) {
        zzhis zzhisVar = this.zzC;
        if (!zzhisVar.zza()) {
            this.zzC = zzhih.zzbF(zzhisVar);
        }
        zzhgk.zzaW(iterable, this.zzC);
    }

    final /* synthetic */ void zzk(int i7) {
        this.zzF = i7;
    }

    final /* synthetic */ void zzl(long j7) {
        this.zzG = j7;
    }

    final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zzL = str;
    }

    final /* synthetic */ void zzn(String str) {
        str.getClass();
        this.zzM = str;
    }

    final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzY = str;
    }

    final /* synthetic */ void zzp(String str) {
        this.zzZ = str;
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzaa = str;
    }

    final /* synthetic */ void zzr(String str) {
        str.getClass();
        this.zzab = str;
    }

    final /* synthetic */ void zzs(String str) {
        str.getClass();
        this.zzac = str;
    }

    final /* synthetic */ void zzt(String str) {
        str.getClass();
        this.zzad = str;
    }

    final /* synthetic */ void zzu(zzfig zzfigVar) {
        this.zzak = zzfigVar.zza();
    }

    final /* synthetic */ void zzv(zzhlz zzhlzVar) {
        this.zzas = zzhlzVar;
        this.zza |= 256;
    }

    final /* synthetic */ void zzw(String str) {
        this.zzat = str;
    }

    final /* synthetic */ void zzy(int i7) {
        this.zzb = i7 - 2;
    }

    final /* synthetic */ void zzz(int i7) {
        this.zzn = 1;
    }
}
