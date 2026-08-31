package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.gson.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC5023b implements InterfaceC5024c {

    /* JADX INFO: renamed from: a */
    public static final EnumC5023b f19036a = new a("IDENTITY", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC5023b f19037b = new EnumC5023b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return EnumC5023b.m22606k(field.getName());
        }
    };

    /* JADX INFO: renamed from: c */
    public static final EnumC5023b f19038c = new EnumC5023b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return EnumC5023b.m22606k(EnumC5023b.m22605j(field.getName(), ' '));
        }
    };

    /* JADX INFO: renamed from: d */
    public static final EnumC5023b f19039d = new EnumC5023b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return EnumC5023b.m22605j(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final EnumC5023b f19040e = new EnumC5023b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.b.e
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return EnumC5023b.m22605j(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final EnumC5023b f19041f = new EnumC5023b("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.b.f
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return EnumC5023b.m22605j(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: r */
    public static final EnumC5023b f19042r = new EnumC5023b("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.b.g
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return EnumC5023b.m22605j(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ EnumC5023b[] f19043s = m22604h();

    /* JADX INFO: renamed from: com.google.gson.b$a */
    final enum a extends EnumC5023b {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override // com.google.gson.InterfaceC5024c
        /* JADX INFO: renamed from: d */
        public String mo22607d(Field field) {
            return field.getName();
        }
    }

    private EnumC5023b(String str, int i7) {
        super(str, i7);
    }

    /* JADX INFO: renamed from: h */
    private static /* synthetic */ EnumC5023b[] m22604h() {
        return new EnumC5023b[]{f19036a, f19037b, f19038c, f19039d, f19040e, f19041f, f19042r};
    }

    /* JADX INFO: renamed from: j */
    static String m22605j(String str, char c7) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c7);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    static String m22606k(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i7 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i7) + upperCase + str.substring(i7 + 1);
            }
        }
        return str;
    }

    public static EnumC5023b valueOf(String str) {
        return (EnumC5023b) Enum.valueOf(EnumC5023b.class, str);
    }

    public static EnumC5023b[] values() {
        return (EnumC5023b[]) f19043s.clone();
    }

    /* synthetic */ EnumC5023b(String str, int i7, a aVar) {
        this(str, i7);
    }
}
