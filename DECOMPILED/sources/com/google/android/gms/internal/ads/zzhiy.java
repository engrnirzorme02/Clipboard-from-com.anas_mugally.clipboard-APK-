package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhiy {
    public static final zzhiy zza;
    public static final zzhiy zzb;
    public static final zzhiy zzc;
    public static final zzhiy zzd;
    public static final zzhiy zze;
    public static final zzhiy zzf;
    public static final zzhiy zzg;
    public static final zzhiy zzh;
    public static final zzhiy zzi;
    public static final zzhiy zzj;
    private static final /* synthetic */ zzhiy[] zzl;
    private final Class zzk;

    static {
        zzhiy zzhiyVar = new zzhiy("VOID", 0, Void.class, Void.class, null);
        zza = zzhiyVar;
        Class cls = Integer.TYPE;
        zzhiy zzhiyVar2 = new zzhiy("INT", 1, cls, Integer.class, 0);
        zzb = zzhiyVar2;
        zzhiy zzhiyVar3 = new zzhiy("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzhiyVar3;
        zzhiy zzhiyVar4 = new zzhiy("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzhiyVar4;
        zzhiy zzhiyVar5 = new zzhiy("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzhiyVar5;
        zzhiy zzhiyVar6 = new zzhiy("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzhiyVar6;
        zzhiy zzhiyVar7 = new zzhiy("STRING", 6, String.class, String.class, "");
        zzg = zzhiyVar7;
        zzhiy zzhiyVar8 = new zzhiy("BYTE_STRING", 7, zzhhb.class, zzhhb.class, zzhhb.zzb);
        zzh = zzhiyVar8;
        zzhiy zzhiyVar9 = new zzhiy("ENUM", 8, cls, Integer.class, null);
        zzi = zzhiyVar9;
        zzhiy zzhiyVar10 = new zzhiy("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzhiyVar10;
        zzl = new zzhiy[]{zzhiyVar, zzhiyVar2, zzhiyVar3, zzhiyVar4, zzhiyVar5, zzhiyVar6, zzhiyVar7, zzhiyVar8, zzhiyVar9, zzhiyVar10};
    }

    private zzhiy(String str, int i7, Class cls, Class cls2, Object obj) {
        super(str, i7);
        this.zzk = cls2;
    }

    public static zzhiy[] values() {
        return (zzhiy[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
