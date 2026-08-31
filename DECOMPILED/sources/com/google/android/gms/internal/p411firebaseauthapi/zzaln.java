package com.google.android.gms.internal.p411firebaseauthapi;

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
public final class zzaln {
    public static final zzaln zza;
    public static final zzaln zzb;
    public static final zzaln zzc;
    public static final zzaln zzd;
    public static final zzaln zze;
    public static final zzaln zzf;
    public static final zzaln zzg;
    public static final zzaln zzh;
    public static final zzaln zzi;
    public static final zzaln zzj;
    private static final /* synthetic */ zzaln[] zzk;
    private final Class<?> zzl;

    static {
        zzaln zzalnVar = new zzaln("VOID", 0, Void.class, Void.class, null);
        zza = zzalnVar;
        Class cls = Integer.TYPE;
        zzaln zzalnVar2 = new zzaln("INT", 1, cls, Integer.class, 0);
        zzb = zzalnVar2;
        zzaln zzalnVar3 = new zzaln("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzalnVar3;
        zzaln zzalnVar4 = new zzaln("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzalnVar4;
        zzaln zzalnVar5 = new zzaln("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzalnVar5;
        zzaln zzalnVar6 = new zzaln("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzalnVar6;
        zzaln zzalnVar7 = new zzaln("STRING", 6, String.class, String.class, "");
        zzg = zzalnVar7;
        zzaln zzalnVar8 = new zzaln("BYTE_STRING", 7, zzajv.class, zzajv.class, zzajv.zza);
        zzh = zzalnVar8;
        zzaln zzalnVar9 = new zzaln("ENUM", 8, cls, Integer.class, null);
        zzi = zzalnVar9;
        zzaln zzalnVar10 = new zzaln("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzalnVar10;
        zzk = new zzaln[]{zzalnVar, zzalnVar2, zzalnVar3, zzalnVar4, zzalnVar5, zzalnVar6, zzalnVar7, zzalnVar8, zzalnVar9, zzalnVar10};
    }

    private zzaln(String str, int i7, Class cls, Class cls2, Object obj) {
        super(str, i7);
        this.zzl = cls2;
    }

    public static zzaln[] values() {
        return (zzaln[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
