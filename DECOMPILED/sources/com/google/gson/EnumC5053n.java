package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.gson.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC5053n {

    /* JADX INFO: renamed from: a */
    public static final EnumC5053n f19233a = new a("DEFAULT", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC5053n f19234b = new EnumC5053n("STRING", 1) { // from class: com.google.gson.n.b
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ EnumC5053n[] f19235c = m22801c();

    /* JADX INFO: renamed from: com.google.gson.n$a */
    final enum a extends EnumC5053n {
        a(String str, int i7) {
            super(str, i7, null);
        }
    }

    private EnumC5053n(String str, int i7) {
        super(str, i7);
    }

    /* JADX INFO: renamed from: c */
    private static /* synthetic */ EnumC5053n[] m22801c() {
        return new EnumC5053n[]{f19233a, f19234b};
    }

    public static EnumC5053n valueOf(String str) {
        return (EnumC5053n) Enum.valueOf(EnumC5053n.class, str);
    }

    public static EnumC5053n[] values() {
        return (EnumC5053n[]) f19235c.clone();
    }

    /* synthetic */ EnumC5053n(String str, int i7, a aVar) {
        this(str, i7);
    }
}
