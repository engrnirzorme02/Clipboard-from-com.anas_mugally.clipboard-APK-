package com.google.android.gms.internal.play_billing;

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
public final class zzhs {
    public static final zzhs zza;
    public static final zzhs zzb;
    public static final zzhs zzc;
    public static final zzhs zzd;
    public static final zzhs zze;
    public static final zzhs zzf;
    public static final zzhs zzg;
    public static final zzhs zzh;
    public static final zzhs zzi;
    public static final zzhs zzj;
    public static final zzhs zzk;
    public static final zzhs zzl;
    public static final zzhs zzm;
    public static final zzhs zzn;
    public static final zzhs zzo;
    public static final zzhs zzp;
    public static final zzhs zzq;
    public static final zzhs zzr;
    private static final /* synthetic */ zzhs[] zzs;
    private final zzht zzt;
    private final int zzu;

    static {
        zzhs zzhsVar = new zzhs("DOUBLE", 0, zzht.DOUBLE, 1);
        zza = zzhsVar;
        zzhs zzhsVar2 = new zzhs("FLOAT", 1, zzht.FLOAT, 5);
        zzb = zzhsVar2;
        zzht zzhtVar = zzht.LONG;
        zzhs zzhsVar3 = new zzhs("INT64", 2, zzhtVar, 0);
        zzc = zzhsVar3;
        zzhs zzhsVar4 = new zzhs("UINT64", 3, zzhtVar, 0);
        zzd = zzhsVar4;
        zzht zzhtVar2 = zzht.INT;
        zzhs zzhsVar5 = new zzhs("INT32", 4, zzhtVar2, 0);
        zze = zzhsVar5;
        zzhs zzhsVar6 = new zzhs("FIXED64", 5, zzhtVar, 1);
        zzf = zzhsVar6;
        zzhs zzhsVar7 = new zzhs("FIXED32", 6, zzhtVar2, 5);
        zzg = zzhsVar7;
        zzhs zzhsVar8 = new zzhs("BOOL", 7, zzht.BOOLEAN, 0);
        zzh = zzhsVar8;
        zzhs zzhsVar9 = new zzhs("STRING", 8, zzht.STRING, 2);
        zzi = zzhsVar9;
        zzht zzhtVar3 = zzht.MESSAGE;
        zzhs zzhsVar10 = new zzhs("GROUP", 9, zzhtVar3, 3);
        zzj = zzhsVar10;
        zzhs zzhsVar11 = new zzhs("MESSAGE", 10, zzhtVar3, 2);
        zzk = zzhsVar11;
        zzhs zzhsVar12 = new zzhs("BYTES", 11, zzht.BYTE_STRING, 2);
        zzl = zzhsVar12;
        zzhs zzhsVar13 = new zzhs("UINT32", 12, zzhtVar2, 0);
        zzm = zzhsVar13;
        zzhs zzhsVar14 = new zzhs("ENUM", 13, zzht.ENUM, 0);
        zzn = zzhsVar14;
        zzhs zzhsVar15 = new zzhs("SFIXED32", 14, zzhtVar2, 5);
        zzo = zzhsVar15;
        zzhs zzhsVar16 = new zzhs("SFIXED64", 15, zzhtVar, 1);
        zzp = zzhsVar16;
        zzhs zzhsVar17 = new zzhs("SINT32", 16, zzhtVar2, 0);
        zzq = zzhsVar17;
        zzhs zzhsVar18 = new zzhs("SINT64", 17, zzhtVar, 0);
        zzr = zzhsVar18;
        zzs = new zzhs[]{zzhsVar, zzhsVar2, zzhsVar3, zzhsVar4, zzhsVar5, zzhsVar6, zzhsVar7, zzhsVar8, zzhsVar9, zzhsVar10, zzhsVar11, zzhsVar12, zzhsVar13, zzhsVar14, zzhsVar15, zzhsVar16, zzhsVar17, zzhsVar18};
    }

    private zzhs(String str, int i7, zzht zzhtVar, int i8) {
        super(str, i7);
        this.zzt = zzhtVar;
        this.zzu = i8;
    }

    public static zzhs[] values() {
        return (zzhs[]) zzs.clone();
    }

    public final zzht zza() {
        return this.zzt;
    }
}
