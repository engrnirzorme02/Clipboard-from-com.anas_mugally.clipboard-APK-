package p391x5;

import com.google.gson.C5025d;
import com.google.gson.EnumC5055p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: x5.c */
/* JADX INFO: loaded from: classes.dex */
public class C7417c implements Closeable, Flushable {

    /* JADX INFO: renamed from: w */
    private static final Pattern f29711w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: x */
    private static final String[] f29712x = new String[128];

    /* JADX INFO: renamed from: y */
    private static final String[] f29713y;

    /* JADX INFO: renamed from: a */
    private final Writer f29714a;

    /* JADX INFO: renamed from: b */
    private int[] f29715b = new int[32];

    /* JADX INFO: renamed from: c */
    private int f29716c = 0;

    /* JADX INFO: renamed from: d */
    private C5025d f29717d;

    /* JADX INFO: renamed from: e */
    private String f29718e;

    /* JADX INFO: renamed from: f */
    private String f29719f;

    /* JADX INFO: renamed from: r */
    private boolean f29720r;

    /* JADX INFO: renamed from: s */
    private EnumC5055p f29721s;

    /* JADX INFO: renamed from: t */
    private boolean f29722t;

    /* JADX INFO: renamed from: u */
    private String f29723u;

    /* JADX INFO: renamed from: v */
    private boolean f29724v;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f29712x[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f29712x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f29713y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C7417c(Writer writer) {
        m32838U0(6);
        this.f29721s = EnumC5055p.LEGACY_STRICT;
        this.f29724v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f29714a = writer;
        m32845W0(C5025d.f19044d);
    }

    /* JADX INFO: renamed from: Q */
    private C7417c m32834Q(int i7, int i8, char c7) throws IOException {
        int iM32837T0 = m32837T0();
        if (iM32837T0 != i8 && iM32837T0 != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f29723u != null) {
            throw new IllegalStateException("Dangling name: " + this.f29723u);
        }
        this.f29716c--;
        if (iM32837T0 == i8) {
            m32835Q0();
        }
        this.f29714a.write(c7);
        return this;
    }

    /* JADX INFO: renamed from: Q0 */
    private void m32835Q0() throws IOException {
        if (this.f29720r) {
            return;
        }
        this.f29714a.write(this.f29717d.m22610b());
        int i7 = this.f29716c;
        for (int i8 = 1; i8 < i7; i8++) {
            this.f29714a.write(this.f29717d.m22609a());
        }
    }

    /* JADX INFO: renamed from: S0 */
    private C7417c m32836S0(int i7, char c7) throws IOException {
        m32844n();
        m32838U0(i7);
        this.f29714a.write(c7);
        return this;
    }

    /* JADX INFO: renamed from: T0 */
    private int m32837T0() {
        int i7 = this.f29716c;
        if (i7 != 0) {
            return this.f29715b[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: U0 */
    private void m32838U0(int i7) {
        int i8 = this.f29716c;
        int[] iArr = this.f29715b;
        if (i8 == iArr.length) {
            this.f29715b = Arrays.copyOf(iArr, i8 * 2);
        }
        int[] iArr2 = this.f29715b;
        int i9 = this.f29716c;
        this.f29716c = i9 + 1;
        iArr2[i9] = i7;
    }

    /* JADX INFO: renamed from: V0 */
    private void m32839V0(int i7) {
        this.f29715b[this.f29716c - 1] = i7;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: a1 */
    private void m32840a1(String str) throws IOException {
        String str2;
        String[] strArr = this.f29722t ? f29713y : f29712x;
        this.f29714a.write(34);
        int length = str.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i7 < i8) {
                        this.f29714a.write(str, i7, i8 - i7);
                    }
                    this.f29714a.write(str2);
                    i7 = i8 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i7 < i8) {
                    this.f29714a.write(str, i7, i8 - i7);
                }
                this.f29714a.write(str2);
                i7 = i8 + 1;
            }
        }
        if (i7 < length) {
            this.f29714a.write(str, i7, length - i7);
        }
        this.f29714a.write(34);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m32841d(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    /* JADX INFO: renamed from: h1 */
    private void m32842h1() throws IOException {
        if (this.f29723u != null) {
            m32843m();
            m32840a1(this.f29723u);
            this.f29723u = null;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m32843m() throws IOException {
        int iM32837T0 = m32837T0();
        if (iM32837T0 == 5) {
            this.f29714a.write(this.f29719f);
        } else if (iM32837T0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m32835Q0();
        m32839V0(4);
    }

    /* JADX INFO: renamed from: n */
    private void m32844n() throws IOException {
        int iM32837T0 = m32837T0();
        if (iM32837T0 == 1) {
            m32839V0(2);
            m32835Q0();
            return;
        }
        if (iM32837T0 == 2) {
            this.f29714a.append((CharSequence) this.f29719f);
            m32835Q0();
        } else {
            if (iM32837T0 == 4) {
                this.f29714a.append((CharSequence) this.f29718e);
                m32839V0(5);
                return;
            }
            if (iM32837T0 != 6) {
                if (iM32837T0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f29721s != EnumC5055p.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m32839V0(7);
        }
    }

    /* JADX INFO: renamed from: J */
    public C7417c mo22679J() throws IOException {
        m32842h1();
        return m32836S0(3, '{');
    }

    /* JADX INFO: renamed from: K0 */
    public C7417c mo22680K0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f29723u != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM32837T0 = m32837T0();
        if (iM32837T0 != 3 && iM32837T0 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f29723u = str;
        return this;
    }

    /* JADX INFO: renamed from: R0 */
    public C7417c mo22681R0() throws IOException {
        if (this.f29723u != null) {
            if (!this.f29724v) {
                this.f29723u = null;
                return this;
            }
            m32842h1();
        }
        m32844n();
        this.f29714a.write("null");
        return this;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m32845W0(C5025d c5025d) {
        Objects.requireNonNull(c5025d);
        this.f29717d = c5025d;
        this.f29719f = ",";
        if (c5025d.m22611c()) {
            this.f29718e = ": ";
            if (this.f29717d.m22610b().isEmpty()) {
                this.f29719f = ", ";
            }
        } else {
            this.f29718e = ":";
        }
        this.f29720r = this.f29717d.m22610b().isEmpty() && this.f29717d.m22609a().isEmpty();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m32846X0(boolean z7) {
        this.f29722t = z7;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m32847Y0(boolean z7) {
        this.f29724v = z7;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m32848Z0(EnumC5055p enumC5055p) {
        Objects.requireNonNull(enumC5055p);
        this.f29721s = enumC5055p;
    }

    /* JADX INFO: renamed from: b1 */
    public C7417c mo22682b1(double d7) throws IOException {
        m32842h1();
        if (this.f29721s == EnumC5055p.LENIENT || !(Double.isNaN(d7) || Double.isInfinite(d7))) {
            m32844n();
            this.f29714a.append((CharSequence) Double.toString(d7));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d7);
    }

    /* JADX INFO: renamed from: c1 */
    public C7417c mo22683c1(long j7) throws IOException {
        m32842h1();
        m32844n();
        this.f29714a.write(Long.toString(j7));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29714a.close();
        int i7 = this.f29716c;
        if (i7 > 1 || (i7 == 1 && this.f29715b[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f29716c = 0;
    }

    /* JADX INFO: renamed from: d0 */
    public C7417c mo22684d0() {
        return m32834Q(1, 2, ']');
    }

    /* JADX INFO: renamed from: d1 */
    public C7417c mo22685d1(Boolean bool) throws IOException {
        if (bool == null) {
            return mo22681R0();
        }
        m32842h1();
        m32844n();
        this.f29714a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: e1 */
    public C7417c mo22686e1(Number number) throws IOException {
        if (number == null) {
            return mo22681R0();
        }
        m32842h1();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!m32841d(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f29721s != EnumC5055p.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f29711w.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m32844n();
        this.f29714a.append((CharSequence) string);
        return this;
    }

    /* JADX INFO: renamed from: f1 */
    public C7417c mo22687f1(String str) throws IOException {
        if (str == null) {
            return mo22681R0();
        }
        m32842h1();
        m32844n();
        m32840a1(str);
        return this;
    }

    public void flush() throws IOException {
        if (this.f29716c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f29714a.flush();
    }

    /* JADX INFO: renamed from: g1 */
    public C7417c mo22688g1(boolean z7) throws IOException {
        m32842h1();
        m32844n();
        this.f29714a.write(z7 ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public C7417c mo22690k0() {
        return m32834Q(3, 5, '}');
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m32849l0() {
        return this.f29724v;
    }

    /* JADX INFO: renamed from: o0 */
    public final EnumC5055p m32850o0() {
        return this.f29721s;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m32851p0() {
        return this.f29722t;
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m32852w0() {
        return this.f29721s == EnumC5055p.LENIENT;
    }

    /* JADX INFO: renamed from: x */
    public C7417c mo22691x() throws IOException {
        m32842h1();
        return m32836S0(1, '[');
    }
}
