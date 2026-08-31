package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhot extends zzhih implements zzhjt {
    private static final zzhot zzR;
    private static volatile zzhka zzS;
    private zzhop zzA;
    private zzhmv zzC;
    private zzhmn zzE;
    private zzhno zzG;
    private int zzH;
    private long zzK;
    private zzhos zzL;
    private zzhnt zzM;
    private zzhom zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private zzhmr zzg;
    private zzhnz zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private zzhog zzv;
    private boolean zzw;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private zzhit zzh = zzhih.zzbM();
    private zzhit zzi = zzhih.zzbM();
    private String zzj = "";
    private zzhit zzm = zzhih.zzbM();
    private String zzn = "";
    private zzhhb zzu = zzhhb.zzb;
    private String zzx = "";
    private zzhit zzy = zzhih.zzbM();
    private zzhit zzz = zzhih.zzbM();
    private zzhit zzB = zzhih.zzbM();
    private String zzD = "";
    private zzhit zzF = zzhih.zzbM();
    private zzhit zzI = zzhih.zzbM();
    private zzhit zzJ = zzhih.zzbM();
    private String zzN = "";
    private zzhit zzP = zzhih.zzbM();

    static {
        zzhot zzhotVar = new zzhot();
        zzR = zzhotVar;
        zzhih.zzbu(zzhot.class, zzhotVar);
    }

    private zzhot() {
    }

    public static zzhmp zzg() {
        return (zzhmp) zzR.zzbn();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        byte[] bArr = null;
        switch (zzhigVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhih.zzbv(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzhoe.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zzhoa.zza, "zzc", zzhmo.zza, "zzg", "zzj", "zzk", "zzu", "zzi", zzhox.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzhpd.class, "zzC", "zzD", "zzE", "zzF", zzhmz.class, "zzG", "zzH", zzhon.zza, "zzI", zzhnr.class, "zzJ", zzhnw.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", zzhoj.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzhot();
            case NEW_BUILDER:
                return new zzhmp(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzR;
            case GET_PARSER:
                zzhka zzhkaVar = zzS;
                if (zzhkaVar != null) {
                    return zzhkaVar;
                }
                synchronized (zzhot.class) {
                    try {
                        zzhicVar = zzS;
                        if (zzhicVar == null) {
                            zzhicVar = new zzhic(zzR);
                            zzS = zzhicVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzhicVar;
            default:
                throw null;
        }
    }

    public final String zze() {
        return this.zzj;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzi(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzj(zzhmr zzhmrVar) {
        zzhmrVar.getClass();
        this.zzg = zzhmrVar;
        this.zza |= 32;
    }

    final /* synthetic */ void zzk(zzhoe zzhoeVar) {
        zzhoeVar.getClass();
        zzhit zzhitVar = this.zzh;
        if (!zzhitVar.zza()) {
            this.zzh = zzhih.zzbN(zzhitVar);
        }
        this.zzh.add(zzhoeVar);
    }

    final /* synthetic */ void zzl(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    final /* synthetic */ void zzn(zzhnz zzhnzVar) {
        zzhnzVar.getClass();
        this.zzk = zzhnzVar;
        this.zza |= 128;
    }

    final /* synthetic */ void zzo(zzhog zzhogVar) {
        zzhogVar.getClass();
        this.zzv = zzhogVar;
        this.zza |= 8192;
    }

    final /* synthetic */ void zzp(Iterable iterable) {
        zzhit zzhitVar = this.zzy;
        if (!zzhitVar.zza()) {
            this.zzy = zzhih.zzbN(zzhitVar);
        }
        zzhgk.zzaW(iterable, this.zzy);
    }

    final /* synthetic */ void zzq(Iterable iterable) {
        zzhit zzhitVar = this.zzz;
        if (!zzhitVar.zza()) {
            this.zzz = zzhih.zzbN(zzhitVar);
        }
        zzhgk.zzaW(iterable, this.zzz);
    }

    final /* synthetic */ void zzs(int i7) {
        this.zzb = i7 - 1;
        this.zza |= 1;
    }
}
