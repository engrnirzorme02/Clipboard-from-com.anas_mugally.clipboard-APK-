package com.google.gson;

import java.io.IOException;
import java.math.BigDecimal;
import p367u5.AbstractC7162A;
import p367u5.C7194y;
import p391x5.C7415a;
import p391x5.C7418d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.gson.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC5056q implements InterfaceC5057r {

    /* JADX INFO: renamed from: a */
    public static final EnumC5056q f19245a = new a("DOUBLE", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC5056q f19246b = new EnumC5056q("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.q.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5057r
        /* JADX INFO: renamed from: c */
        public Number mo22805c(C7415a c7415a) {
            return new C7194y(c7415a.m32822b1());
        }
    };

    /* JADX INFO: renamed from: c */
    public static final EnumC5056q f19247c = new EnumC5056q("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.q.c
        {
            a aVar = null;
        }

        /* JADX INFO: renamed from: h */
        private Number m22807h(String str, C7415a c7415a) throws C7418d {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!c7415a.m32814Q0()) {
                        throw new C7418d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c7415a.m32830p0());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e7) {
                throw new C5050k("Cannot parse " + str + "; at path " + c7415a.m32830p0(), e7);
            }
        }

        @Override // com.google.gson.InterfaceC5057r
        /* JADX INFO: renamed from: c */
        public Number mo22805c(C7415a c7415a) throws IOException {
            String strM32822b1 = c7415a.m32822b1();
            if (strM32822b1.indexOf(46) >= 0) {
                return m22807h(strM32822b1, c7415a);
            }
            try {
                return Long.valueOf(Long.parseLong(strM32822b1));
            } catch (NumberFormatException unused) {
                return m22807h(strM32822b1, c7415a);
            }
        }
    };

    /* JADX INFO: renamed from: d */
    public static final EnumC5056q f19248d = new EnumC5056q("BIG_DECIMAL", 3) { // from class: com.google.gson.q.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.InterfaceC5057r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo22805c(C7415a c7415a) throws IOException {
            String strM32822b1 = c7415a.m32822b1();
            try {
                return AbstractC7162A.m31664b(strM32822b1);
            } catch (NumberFormatException e7) {
                throw new C5050k("Cannot parse " + strM32822b1 + "; at path " + c7415a.m32830p0(), e7);
            }
        }
    };

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumC5056q[] f19249e = m22804d();

    /* JADX INFO: renamed from: com.google.gson.q$a */
    final enum a extends EnumC5056q {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override // com.google.gson.InterfaceC5057r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double mo22805c(C7415a c7415a) {
            return Double.valueOf(c7415a.m32817U0());
        }
    }

    private EnumC5056q(String str, int i7) {
        super(str, i7);
    }

    /* JADX INFO: renamed from: d */
    private static /* synthetic */ EnumC5056q[] m22804d() {
        return new EnumC5056q[]{f19245a, f19246b, f19247c, f19248d};
    }

    public static EnumC5056q valueOf(String str) {
        return (EnumC5056q) Enum.valueOf(EnumC5056q.class, str);
    }

    public static EnumC5056q[] values() {
        return (EnumC5056q[]) f19249e.clone();
    }

    /* synthetic */ EnumC5056q(String str, int i7, a aVar) {
        this(str, i7);
    }
}
