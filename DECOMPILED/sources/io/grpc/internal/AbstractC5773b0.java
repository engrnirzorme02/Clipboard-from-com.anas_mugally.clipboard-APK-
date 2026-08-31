package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;
import p391x5.C7415a;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: io.grpc.internal.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5773b0 {

    /* JADX INFO: renamed from: a */
    private static final Logger f22417a = Logger.getLogger(AbstractC5773b0.class.getName());

    /* JADX INFO: renamed from: io.grpc.internal.b0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22418a;

        static {
            int[] iArr = new int[EnumC7416b.values().length];
            f22418a = iArr;
            try {
                iArr[EnumC7416b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22418a[EnumC7416b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22418a[EnumC7416b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22418a[EnumC7416b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22418a[EnumC7416b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22418a[EnumC7416b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m25848a(String str) {
        C7415a c7415a = new C7415a(new StringReader(str));
        try {
            Object objM25852e = m25852e(c7415a);
            try {
                return objM25852e;
            } catch (IOException e7) {
                return objM25852e;
            }
        } finally {
            try {
                c7415a.close();
            } catch (IOException e8) {
                f22417a.log(Level.WARNING, "Failed to close", (Throwable) e8);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static List m25849b(C7415a c7415a) throws IOException {
        c7415a.m32827m();
        ArrayList arrayList = new ArrayList();
        while (c7415a.m32812K0()) {
            arrayList.add(m25852e(c7415a));
        }
        AbstractC1209m.m5309u(c7415a.m32824d1() == EnumC7416b.END_ARRAY, "Bad token: " + c7415a.m32831q0());
        c7415a.m32823d0();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: c */
    private static Void m25850c(C7415a c7415a) throws IOException {
        c7415a.m32821Z0();
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static Map m25851d(C7415a c7415a) throws IOException {
        c7415a.m32828n();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (c7415a.m32812K0()) {
            linkedHashMap.put(c7415a.m32820X0(), m25852e(c7415a));
        }
        AbstractC1209m.m5309u(c7415a.m32824d1() == EnumC7416b.END_OBJECT, "Bad token: " + c7415a.m32831q0());
        c7415a.m32826k0();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: e */
    private static Object m25852e(C7415a c7415a) {
        AbstractC1209m.m5309u(c7415a.m32812K0(), "unexpected end of JSON");
        switch (a.f22418a[c7415a.m32824d1().ordinal()]) {
            case 1:
                return m25849b(c7415a);
            case 2:
                return m25851d(c7415a);
            case 3:
                return c7415a.m32822b1();
            case 4:
                return Double.valueOf(c7415a.m32817U0());
            case 5:
                return Boolean.valueOf(c7415a.m32816T0());
            case 6:
                return m25850c(c7415a);
            default:
                throw new IllegalStateException("Bad token: " + c7415a.m32831q0());
        }
    }
}
