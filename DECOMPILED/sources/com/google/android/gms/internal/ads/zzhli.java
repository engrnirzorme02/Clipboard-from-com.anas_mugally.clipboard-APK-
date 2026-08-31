package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhli {
    public static final zzhli zza;
    public static final zzhli zzb;
    public static final zzhli zzc;
    public static final zzhli zzd;
    public static final zzhli zze;
    public static final zzhli zzf;
    public static final zzhli zzg;
    public static final zzhli zzh;
    public static final zzhli zzi;
    public static final zzhli zzj;
    public static final zzhli zzk;
    public static final zzhli zzl;
    public static final zzhli zzm;
    public static final zzhli zzn;
    public static final zzhli zzo;
    public static final zzhli zzp;
    public static final zzhli zzq;
    public static final zzhli zzr;
    private static final /* synthetic */ zzhli[] zzu;
    private final zzhlj zzs;
    private final int zzt;

    static {
        zzhli zzhliVar = new zzhli("DOUBLE", 0, zzhlj.DOUBLE, 1);
        zza = zzhliVar;
        zzhli zzhliVar2 = new zzhli("FLOAT", 1, zzhlj.FLOAT, 5);
        zzb = zzhliVar2;
        zzhlj zzhljVar = zzhlj.LONG;
        zzhli zzhliVar3 = new zzhli("INT64", 2, zzhljVar, 0);
        zzc = zzhliVar3;
        zzhli zzhliVar4 = new zzhli("UINT64", 3, zzhljVar, 0);
        zzd = zzhliVar4;
        zzhlj zzhljVar2 = zzhlj.INT;
        zzhli zzhliVar5 = new zzhli("INT32", 4, zzhljVar2, 0);
        zze = zzhliVar5;
        zzhli zzhliVar6 = new zzhli("FIXED64", 5, zzhljVar, 1);
        zzf = zzhliVar6;
        zzhli zzhliVar7 = new zzhli("FIXED32", 6, zzhljVar2, 5);
        zzg = zzhliVar7;
        zzhli zzhliVar8 = new zzhli("BOOL", 7, zzhlj.BOOLEAN, 0);
        zzh = zzhliVar8;
        zzhli zzhliVar9 = new zzhli("STRING", 8, zzhlj.STRING, 2);
        zzi = zzhliVar9;
        zzhlj zzhljVar3 = zzhlj.MESSAGE;
        zzhli zzhliVar10 = new zzhli("GROUP", 9, zzhljVar3, 3);
        zzj = zzhliVar10;
        zzhli zzhliVar11 = new zzhli("MESSAGE", 10, zzhljVar3, 2);
        zzk = zzhliVar11;
        zzhli zzhliVar12 = new zzhli("BYTES", 11, zzhlj.BYTE_STRING, 2);
        zzl = zzhliVar12;
        zzhli zzhliVar13 = new zzhli("UINT32", 12, zzhljVar2, 0);
        zzm = zzhliVar13;
        zzhli zzhliVar14 = new zzhli("ENUM", 13, zzhlj.ENUM, 0);
        zzn = zzhliVar14;
        zzhli zzhliVar15 = new zzhli("SFIXED32", 14, zzhljVar2, 5);
        zzo = zzhliVar15;
        zzhli zzhliVar16 = new zzhli("SFIXED64", 15, zzhljVar, 1);
        zzp = zzhliVar16;
        zzhli zzhliVar17 = new zzhli("SINT32", 16, zzhljVar2, 0);
        zzq = zzhliVar17;
        zzhli zzhliVar18 = new zzhli("SINT64", 17, zzhljVar, 0);
        zzr = zzhliVar18;
        zzu = new zzhli[]{zzhliVar, zzhliVar2, zzhliVar3, zzhliVar4, zzhliVar5, zzhliVar6, zzhliVar7, zzhliVar8, zzhliVar9, zzhliVar10, zzhliVar11, zzhliVar12, zzhliVar13, zzhliVar14, zzhliVar15, zzhliVar16, zzhliVar17, zzhliVar18};
    }

    private zzhli(String str, int i7, zzhlj zzhljVar, int i8) {
        super(str, i7);
        this.zzs = zzhljVar;
        this.zzt = i8;
    }

    public static zzhli[] values() {
        return (zzhli[]) zzu.clone();
    }

    public final zzhlj zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
