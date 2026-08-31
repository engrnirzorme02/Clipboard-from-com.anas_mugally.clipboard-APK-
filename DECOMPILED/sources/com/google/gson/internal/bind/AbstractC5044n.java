package com.google.gson.internal.bind;

import com.google.gson.AbstractC5028g;
import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5029h;
import com.google.gson.C5052m;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p367u5.AbstractC7162A;
import p367u5.AbstractC7168G;
import p367u5.C7194y;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5044n {

    /* JADX INFO: renamed from: A */
    public static final AbstractC5059s f19156A;

    /* JADX INFO: renamed from: B */
    public static final AbstractC5059s f19157B;

    /* JADX INFO: renamed from: C */
    public static final InterfaceC5060t f19158C;

    /* JADX INFO: renamed from: D */
    public static final AbstractC5059s f19159D;

    /* JADX INFO: renamed from: E */
    public static final InterfaceC5060t f19160E;

    /* JADX INFO: renamed from: F */
    public static final AbstractC5059s f19161F;

    /* JADX INFO: renamed from: G */
    public static final InterfaceC5060t f19162G;

    /* JADX INFO: renamed from: H */
    public static final AbstractC5059s f19163H;

    /* JADX INFO: renamed from: I */
    public static final InterfaceC5060t f19164I;

    /* JADX INFO: renamed from: J */
    public static final AbstractC5059s f19165J;

    /* JADX INFO: renamed from: K */
    public static final InterfaceC5060t f19166K;

    /* JADX INFO: renamed from: L */
    public static final AbstractC5059s f19167L;

    /* JADX INFO: renamed from: M */
    public static final InterfaceC5060t f19168M;

    /* JADX INFO: renamed from: N */
    public static final AbstractC5059s f19169N;

    /* JADX INFO: renamed from: O */
    public static final InterfaceC5060t f19170O;

    /* JADX INFO: renamed from: P */
    public static final AbstractC5059s f19171P;

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC5060t f19172Q;

    /* JADX INFO: renamed from: R */
    public static final AbstractC5059s f19173R;

    /* JADX INFO: renamed from: S */
    public static final InterfaceC5060t f19174S;

    /* JADX INFO: renamed from: T */
    public static final AbstractC5059s f19175T;

    /* JADX INFO: renamed from: U */
    public static final InterfaceC5060t f19176U;

    /* JADX INFO: renamed from: V */
    public static final AbstractC5059s f19177V;

    /* JADX INFO: renamed from: W */
    public static final InterfaceC5060t f19178W;

    /* JADX INFO: renamed from: X */
    public static final InterfaceC5060t f19179X;

    /* JADX INFO: renamed from: a */
    public static final AbstractC5059s f19180a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5060t f19181b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC5059s f19182c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5060t f19183d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC5059s f19184e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC5059s f19185f;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC5060t f19186g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC5059s f19187h;

    /* JADX INFO: renamed from: i */
    public static final InterfaceC5060t f19188i;

    /* JADX INFO: renamed from: j */
    public static final AbstractC5059s f19189j;

    /* JADX INFO: renamed from: k */
    public static final InterfaceC5060t f19190k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC5059s f19191l;

    /* JADX INFO: renamed from: m */
    public static final InterfaceC5060t f19192m;

    /* JADX INFO: renamed from: n */
    public static final AbstractC5059s f19193n;

    /* JADX INFO: renamed from: o */
    public static final InterfaceC5060t f19194o;

    /* JADX INFO: renamed from: p */
    public static final AbstractC5059s f19195p;

    /* JADX INFO: renamed from: q */
    public static final InterfaceC5060t f19196q;

    /* JADX INFO: renamed from: r */
    public static final AbstractC5059s f19197r;

    /* JADX INFO: renamed from: s */
    public static final InterfaceC5060t f19198s;

    /* JADX INFO: renamed from: t */
    public static final AbstractC5059s f19199t;

    /* JADX INFO: renamed from: u */
    public static final AbstractC5059s f19200u;

    /* JADX INFO: renamed from: v */
    public static final AbstractC5059s f19201v;

    /* JADX INFO: renamed from: w */
    public static final AbstractC5059s f19202w;

    /* JADX INFO: renamed from: x */
    public static final InterfaceC5060t f19203x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC5059s f19204y;

    /* JADX INFO: renamed from: z */
    public static final AbstractC5059s f19205z;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$A */
    class A extends AbstractC5059s {
        A() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return Boolean.valueOf(c7415a.m32822b1());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Boolean bool) throws IOException {
            c7417c.mo22687f1(bool == null ? "null" : bool.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$B */
    class B extends AbstractC5059s {
        B() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            try {
                int iM32818V0 = c7415a.m32818V0();
                if (iM32818V0 <= 255 && iM32818V0 >= -128) {
                    return Byte.valueOf((byte) iM32818V0);
                }
                throw new C5052m("Lossy conversion from " + iM32818V0 + " to byte; at path " + c7415a.m32830p0());
            } catch (NumberFormatException e7) {
                throw new C5052m(e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
            } else {
                c7417c.mo22683c1(number.byteValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$C */
    class C extends AbstractC5059s {
        C() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            try {
                int iM32818V0 = c7415a.m32818V0();
                if (iM32818V0 <= 65535 && iM32818V0 >= -32768) {
                    return Short.valueOf((short) iM32818V0);
                }
                throw new C5052m("Lossy conversion from " + iM32818V0 + " to short; at path " + c7415a.m32830p0());
            } catch (NumberFormatException e7) {
                throw new C5052m(e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
            } else {
                c7417c.mo22683c1(number.shortValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$D */
    class D extends AbstractC5059s {
        D() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            try {
                return Integer.valueOf(c7415a.m32818V0());
            } catch (NumberFormatException e7) {
                throw new C5052m(e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
            } else {
                c7417c.mo22683c1(number.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$E */
    class E extends AbstractC5059s {
        E() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo22636b(C7415a c7415a) {
            try {
                return new AtomicInteger(c7415a.m32818V0());
            } catch (NumberFormatException e7) {
                throw new C5052m(e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, AtomicInteger atomicInteger) throws IOException {
            c7417c.mo22683c1(atomicInteger.get());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$F */
    class F extends AbstractC5059s {
        F() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo22636b(C7415a c7415a) {
            return new AtomicBoolean(c7415a.m32816T0());
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, AtomicBoolean atomicBoolean) throws IOException {
            c7417c.mo22688g1(atomicBoolean.get());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$a, reason: case insensitive filesystem */
    class C7732a extends AbstractC5059s {
        C7732a() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo22636b(C7415a c7415a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c7415a.m32827m();
            while (c7415a.m32812K0()) {
                try {
                    arrayList.add(Integer.valueOf(c7415a.m32818V0()));
                } catch (NumberFormatException e7) {
                    throw new C5052m(e7);
                }
            }
            c7415a.m32823d0();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i7 = 0; i7 < size; i7++) {
                atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c7417c.mo22691x();
            int length = atomicIntegerArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                c7417c.mo22683c1(atomicIntegerArray.get(i7));
            }
            c7417c.mo22684d0();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$b, reason: case insensitive filesystem */
    class C7733b extends AbstractC5059s {
        C7733b() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            try {
                return Long.valueOf(c7415a.m32819W0());
            } catch (NumberFormatException e7) {
                throw new C5052m(e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
            } else {
                c7417c.mo22683c1(number.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$c, reason: case insensitive filesystem */
    class C7734c extends AbstractC5059s {
        C7734c() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return Float.valueOf((float) c7415a.m32817U0());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            c7417c.mo22686e1(number);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$d, reason: case insensitive filesystem */
    class C7735d extends AbstractC5059s {
        C7735d() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return Double.valueOf(c7415a.m32817U0());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Number number) throws IOException {
            if (number == null) {
                c7417c.mo22681R0();
            } else {
                c7417c.mo22682b1(number.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$e, reason: case insensitive filesystem */
    class C7736e extends AbstractC5059s {
        C7736e() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            String strM32822b1 = c7415a.m32822b1();
            if (strM32822b1.length() == 1) {
                return Character.valueOf(strM32822b1.charAt(0));
            }
            throw new C5052m("Expecting character, got: " + strM32822b1 + "; at " + c7415a.m32830p0());
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Character ch) throws IOException {
            c7417c.mo22687f1(ch == null ? null : String.valueOf(ch));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$f, reason: case insensitive filesystem */
    class C7737f extends AbstractC5059s {
        C7737f() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String mo22636b(C7415a c7415a) throws IOException {
            EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
            if (enumC7416bM32824d1 != EnumC7416b.NULL) {
                return enumC7416bM32824d1 == EnumC7416b.BOOLEAN ? Boolean.toString(c7415a.m32816T0()) : c7415a.m32822b1();
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, String str) throws IOException {
            c7417c.mo22687f1(str);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$g */
    class g extends AbstractC5059s {
        g() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            String strM32822b1 = c7415a.m32822b1();
            try {
                return AbstractC7162A.m31664b(strM32822b1);
            } catch (NumberFormatException e7) {
                throw new C5052m("Failed parsing '" + strM32822b1 + "' as BigDecimal; at path " + c7415a.m32830p0(), e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, BigDecimal bigDecimal) throws IOException {
            c7417c.mo22686e1(bigDecimal);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$h */
    class h extends AbstractC5059s {
        h() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            String strM32822b1 = c7415a.m32822b1();
            try {
                return AbstractC7162A.m31665c(strM32822b1);
            } catch (NumberFormatException e7) {
                throw new C5052m("Failed parsing '" + strM32822b1 + "' as BigInteger; at path " + c7415a.m32830p0(), e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, BigInteger bigInteger) throws IOException {
            c7417c.mo22686e1(bigInteger);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$i */
    class i extends AbstractC5059s {
        i() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C7194y mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return new C7194y(c7415a.m32822b1());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, C7194y c7194y) throws IOException {
            c7417c.mo22686e1(c7194y);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$j */
    class j extends AbstractC5059s {
        j() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return new StringBuilder(c7415a.m32822b1());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, StringBuilder sb) throws IOException {
            c7417c.mo22687f1(sb == null ? null : sb.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$k */
    class k extends AbstractC5059s {
        k() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class mo22636b(C7415a c7415a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + AbstractC7168G.m31678a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + AbstractC7168G.m31678a("java-lang-class-unsupported"));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$l */
    class l extends AbstractC5059s {
        l() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return new StringBuffer(c7415a.m32822b1());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, StringBuffer stringBuffer) throws IOException {
            c7417c.mo22687f1(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$m */
    class m extends AbstractC5059s {
        m() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            String strM32822b1 = c7415a.m32822b1();
            if (strM32822b1.equals("null")) {
                return null;
            }
            return new URL(strM32822b1);
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, URL url) throws IOException {
            c7417c.mo22687f1(url == null ? null : url.toExternalForm());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$n */
    class n extends AbstractC5059s {
        n() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            try {
                String strM32822b1 = c7415a.m32822b1();
                if (strM32822b1.equals("null")) {
                    return null;
                }
                return new URI(strM32822b1);
            } catch (URISyntaxException e7) {
                throw new C5029h(e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, URI uri) throws IOException {
            c7417c.mo22687f1(uri == null ? null : uri.toASCIIString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$o */
    class o extends AbstractC5059s {
        o() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return InetAddress.getByName(c7415a.m32822b1());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, InetAddress inetAddress) throws IOException {
            c7417c.mo22687f1(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$p */
    class p extends AbstractC5059s {
        p() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            String strM32822b1 = c7415a.m32822b1();
            try {
                return UUID.fromString(strM32822b1);
            } catch (IllegalArgumentException e7) {
                throw new C5052m("Failed parsing '" + strM32822b1 + "' as UUID; at path " + c7415a.m32830p0(), e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, UUID uuid) throws IOException {
            c7417c.mo22687f1(uuid == null ? null : uuid.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$q */
    class q extends AbstractC5059s {
        q() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency mo22636b(C7415a c7415a) throws IOException {
            String strM32822b1 = c7415a.m32822b1();
            try {
                return Currency.getInstance(strM32822b1);
            } catch (IllegalArgumentException e7) {
                throw new C5052m("Failed parsing '" + strM32822b1 + "' as Currency; at path " + c7415a.m32830p0(), e7);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Currency currency) throws IOException {
            c7417c.mo22687f1(currency.getCurrencyCode());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$r */
    class r extends AbstractC5059s {
        r() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            c7415a.m32828n();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (c7415a.m32824d1() != EnumC7416b.END_OBJECT) {
                String strM32820X0 = c7415a.m32820X0();
                int iM32818V0 = c7415a.m32818V0();
                strM32820X0.getClass();
                switch (strM32820X0) {
                    case "dayOfMonth":
                        i9 = iM32818V0;
                        break;
                    case "minute":
                        i11 = iM32818V0;
                        break;
                    case "second":
                        i12 = iM32818V0;
                        break;
                    case "year":
                        i7 = iM32818V0;
                        break;
                    case "month":
                        i8 = iM32818V0;
                        break;
                    case "hourOfDay":
                        i10 = iM32818V0;
                        break;
                }
            }
            c7415a.m32826k0();
            return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c7417c.mo22681R0();
                return;
            }
            c7417c.mo22679J();
            c7417c.mo22680K0("year");
            c7417c.mo22683c1(calendar.get(1));
            c7417c.mo22680K0("month");
            c7417c.mo22683c1(calendar.get(2));
            c7417c.mo22680K0("dayOfMonth");
            c7417c.mo22683c1(calendar.get(5));
            c7417c.mo22680K0("hourOfDay");
            c7417c.mo22683c1(calendar.get(11));
            c7417c.mo22680K0("minute");
            c7417c.mo22683c1(calendar.get(12));
            c7417c.mo22680K0("second");
            c7417c.mo22683c1(calendar.get(13));
            c7417c.mo22690k0();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$s */
    class s extends AbstractC5059s {
        s() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c7415a.m32822b1(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Locale locale) throws IOException {
            c7417c.mo22687f1(locale == null ? null : locale.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$t */
    class t implements InterfaceC5060t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Class f19206a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC5059s f19207b;

        t(Class cls, AbstractC5059s abstractC5059s) {
            this.f19206a = cls;
            this.f19207b = abstractC5059s;
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            if (c5058a.m22814c() == this.f19206a) {
                return this.f19207b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f19206a.getName() + ",adapter=" + this.f19207b + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$u */
    class u extends AbstractC5059s {
        u() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet mo22636b(C7415a c7415a) throws IOException {
            BitSet bitSet = new BitSet();
            c7415a.m32827m();
            EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
            int i7 = 0;
            while (enumC7416bM32824d1 != EnumC7416b.END_ARRAY) {
                int i8 = y.f19218a[enumC7416bM32824d1.ordinal()];
                boolean zM32816T0 = true;
                if (i8 == 1 || i8 == 2) {
                    int iM32818V0 = c7415a.m32818V0();
                    if (iM32818V0 == 0) {
                        zM32816T0 = false;
                    } else if (iM32818V0 != 1) {
                        throw new C5052m("Invalid bitset value " + iM32818V0 + ", expected 0 or 1; at path " + c7415a.m32830p0());
                    }
                } else {
                    if (i8 != 3) {
                        throw new C5052m("Invalid bitset value type: " + enumC7416bM32824d1 + "; at path " + c7415a.m32831q0());
                    }
                    zM32816T0 = c7415a.m32816T0();
                }
                if (zM32816T0) {
                    bitSet.set(i7);
                }
                i7++;
                enumC7416bM32824d1 = c7415a.m32824d1();
            }
            c7415a.m32823d0();
            return bitSet;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, BitSet bitSet) throws IOException {
            c7417c.mo22691x();
            int length = bitSet.length();
            for (int i7 = 0; i7 < length; i7++) {
                c7417c.mo22683c1(bitSet.get(i7) ? 1L : 0L);
            }
            c7417c.mo22684d0();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$v */
    class v implements InterfaceC5060t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Class f19208a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Class f19209b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC5059s f19210c;

        v(Class cls, Class cls2, AbstractC5059s abstractC5059s) {
            this.f19208a = cls;
            this.f19209b = cls2;
            this.f19210c = abstractC5059s;
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            Class clsM22814c = c5058a.m22814c();
            if (clsM22814c == this.f19208a || clsM22814c == this.f19209b) {
                return this.f19210c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f19209b.getName() + "+" + this.f19208a.getName() + ",adapter=" + this.f19210c + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$w */
    class w implements InterfaceC5060t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Class f19211a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Class f19212b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC5059s f19213c;

        w(Class cls, Class cls2, AbstractC5059s abstractC5059s) {
            this.f19211a = cls;
            this.f19212b = cls2;
            this.f19213c = abstractC5059s;
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            Class clsM22814c = c5058a.m22814c();
            if (clsM22814c == this.f19211a || clsM22814c == this.f19212b) {
                return this.f19213c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f19211a.getName() + "+" + this.f19212b.getName() + ",adapter=" + this.f19213c + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$x */
    class x implements InterfaceC5060t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Class f19214a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC5059s f19215b;

        /* JADX INFO: renamed from: com.google.gson.internal.bind.n$x$a */
        class a extends AbstractC5059s {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Class f19216a;

            a(Class cls) {
                this.f19216a = cls;
            }

            @Override // com.google.gson.AbstractC5059s
            /* JADX INFO: renamed from: b */
            public Object mo22636b(C7415a c7415a) {
                Object objMo22636b = x.this.f19215b.mo22636b(c7415a);
                if (objMo22636b == null || this.f19216a.isInstance(objMo22636b)) {
                    return objMo22636b;
                }
                throw new C5052m("Expected a " + this.f19216a.getName() + " but was " + objMo22636b.getClass().getName() + "; at path " + c7415a.m32830p0());
            }

            @Override // com.google.gson.AbstractC5059s
            /* JADX INFO: renamed from: d */
            public void mo22637d(C7417c c7417c, Object obj) {
                x.this.f19215b.mo22637d(c7417c, obj);
            }
        }

        x(Class cls, AbstractC5059s abstractC5059s) {
            this.f19214a = cls;
            this.f19215b = abstractC5059s;
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            Class<?> clsM22814c = c5058a.m22814c();
            if (this.f19214a.isAssignableFrom(clsM22814c)) {
                return new a(clsM22814c);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f19214a.getName() + ",adapter=" + this.f19215b + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$y */
    static /* synthetic */ class y {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19218a;

        static {
            int[] iArr = new int[EnumC7416b.values().length];
            f19218a = iArr;
            try {
                iArr[EnumC7416b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19218a[EnumC7416b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19218a[EnumC7416b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$z */
    class z extends AbstractC5059s {
        z() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo22636b(C7415a c7415a) throws IOException {
            EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
            if (enumC7416bM32824d1 != EnumC7416b.NULL) {
                return enumC7416bM32824d1 == EnumC7416b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c7415a.m32822b1())) : Boolean.valueOf(c7415a.m32816T0());
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Boolean bool) throws IOException {
            c7417c.mo22685d1(bool);
        }
    }

    static {
        AbstractC5059s abstractC5059sM22816a = new k().m22816a();
        f19180a = abstractC5059sM22816a;
        f19181b = m22723a(Class.class, abstractC5059sM22816a);
        AbstractC5059s abstractC5059sM22816a2 = new u().m22816a();
        f19182c = abstractC5059sM22816a2;
        f19183d = m22723a(BitSet.class, abstractC5059sM22816a2);
        z zVar = new z();
        f19184e = zVar;
        f19185f = new A();
        f19186g = m22724b(Boolean.TYPE, Boolean.class, zVar);
        B b7 = new B();
        f19187h = b7;
        f19188i = m22724b(Byte.TYPE, Byte.class, b7);
        C c7 = new C();
        f19189j = c7;
        f19190k = m22724b(Short.TYPE, Short.class, c7);
        D d7 = new D();
        f19191l = d7;
        f19192m = m22724b(Integer.TYPE, Integer.class, d7);
        AbstractC5059s abstractC5059sM22816a3 = new E().m22816a();
        f19193n = abstractC5059sM22816a3;
        f19194o = m22723a(AtomicInteger.class, abstractC5059sM22816a3);
        AbstractC5059s abstractC5059sM22816a4 = new F().m22816a();
        f19195p = abstractC5059sM22816a4;
        f19196q = m22723a(AtomicBoolean.class, abstractC5059sM22816a4);
        AbstractC5059s abstractC5059sM22816a5 = new C7732a().m22816a();
        f19197r = abstractC5059sM22816a5;
        f19198s = m22723a(AtomicIntegerArray.class, abstractC5059sM22816a5);
        f19199t = new C7733b();
        f19200u = new C7734c();
        f19201v = new C7735d();
        C7736e c7736e = new C7736e();
        f19202w = c7736e;
        f19203x = m22724b(Character.TYPE, Character.class, c7736e);
        C7737f c7737f = new C7737f();
        f19204y = c7737f;
        f19205z = new g();
        f19156A = new h();
        f19157B = new i();
        f19158C = m22723a(String.class, c7737f);
        j jVar = new j();
        f19159D = jVar;
        f19160E = m22723a(StringBuilder.class, jVar);
        l lVar = new l();
        f19161F = lVar;
        f19162G = m22723a(StringBuffer.class, lVar);
        m mVar = new m();
        f19163H = mVar;
        f19164I = m22723a(URL.class, mVar);
        n nVar = new n();
        f19165J = nVar;
        f19166K = m22723a(URI.class, nVar);
        o oVar = new o();
        f19167L = oVar;
        f19168M = m22726d(InetAddress.class, oVar);
        p pVar = new p();
        f19169N = pVar;
        f19170O = m22723a(UUID.class, pVar);
        AbstractC5059s abstractC5059sM22816a6 = new q().m22816a();
        f19171P = abstractC5059sM22816a6;
        f19172Q = m22723a(Currency.class, abstractC5059sM22816a6);
        r rVar = new r();
        f19173R = rVar;
        f19174S = m22725c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f19175T = sVar;
        f19176U = m22723a(Locale.class, sVar);
        C5036f c5036f = C5036f.f19106a;
        f19177V = c5036f;
        f19178W = m22726d(AbstractC5028g.class, c5036f);
        f19179X = C5034d.f19098d;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5060t m22723a(Class cls, AbstractC5059s abstractC5059s) {
        return new t(cls, abstractC5059s);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5060t m22724b(Class cls, Class cls2, AbstractC5059s abstractC5059s) {
        return new v(cls, cls2, abstractC5059s);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC5060t m22725c(Class cls, Class cls2, AbstractC5059s abstractC5059s) {
        return new w(cls, cls2, abstractC5059s);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC5060t m22726d(Class cls, AbstractC5059s abstractC5059s) {
        return new x(cls, abstractC5059s);
    }
}
