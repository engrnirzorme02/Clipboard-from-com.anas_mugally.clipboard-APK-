package p136R3;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import p122P3.AbstractC1209m;
import p143S3.AbstractC1413a;

/* JADX INFO: renamed from: R3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1331a {

    /* JADX INFO: renamed from: a */
    private static final AbstractC1331a f4641a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b */
    private static final AbstractC1331a f4642b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c */
    private static final AbstractC1331a f4643c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d */
    private static final AbstractC1331a f4644d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e */
    private static final AbstractC1331a f4645e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: R3.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final String f4646a;

        /* JADX INFO: renamed from: b */
        private final char[] f4647b;

        /* JADX INFO: renamed from: c */
        final int f4648c;

        /* JADX INFO: renamed from: d */
        final int f4649d;

        /* JADX INFO: renamed from: e */
        final int f4650e;

        /* JADX INFO: renamed from: f */
        final int f4651f;

        /* JADX INFO: renamed from: g */
        private final byte[] f4652g;

        /* JADX INFO: renamed from: h */
        private final boolean[] f4653h;

        /* JADX INFO: renamed from: i */
        private final boolean f4654i;

        a(String str, char[] cArr) {
            this(str, cArr, m5705b(cArr), false);
        }

        /* JADX INFO: renamed from: b */
        private static byte[] m5705b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i7 = 0; i7 < cArr.length; i7++) {
                char c7 = cArr[i7];
                boolean z7 = true;
                AbstractC1209m.m5294f(c7 < 128, "Non-ASCII character: %s", c7);
                if (bArr[c7] != -1) {
                    z7 = false;
                }
                AbstractC1209m.m5294f(z7, "Duplicate character: %s", c7);
                bArr[c7] = (byte) i7;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: c */
        int m5706c(char c7) throws d {
            if (c7 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c7));
            }
            byte b7 = this.f4652g[c7];
            if (b7 != -1) {
                return b7;
            }
            if (c7 <= ' ' || c7 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c7));
            }
            throw new d("Unrecognized character: " + c7);
        }

        /* JADX INFO: renamed from: d */
        char m5707d(int i7) {
            return this.f4647b[i7];
        }

        /* JADX INFO: renamed from: e */
        boolean m5708e(int i7) {
            return this.f4653h[i7 % this.f4650e];
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f4654i == aVar.f4654i && Arrays.equals(this.f4647b, aVar.f4647b)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m5709f(char c7) {
            byte[] bArr = this.f4652g;
            return c7 < bArr.length && bArr[c7] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f4647b) + (this.f4654i ? 1231 : 1237);
        }

        public String toString() {
            return this.f4646a;
        }

        private a(String str, char[] cArr, byte[] bArr, boolean z7) {
            this.f4646a = (String) AbstractC1209m.m5302n(str);
            this.f4647b = (char[]) AbstractC1209m.m5302n(cArr);
            try {
                int iM6005d = AbstractC1413a.m6005d(cArr.length, RoundingMode.UNNECESSARY);
                this.f4649d = iM6005d;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM6005d);
                int i7 = 1 << (3 - iNumberOfTrailingZeros);
                this.f4650e = i7;
                this.f4651f = iM6005d >> iNumberOfTrailingZeros;
                this.f4648c = cArr.length - 1;
                this.f4652g = bArr;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 < this.f4651f; i8++) {
                    zArr[AbstractC1413a.m6002a(i8 * 8, this.f4649d, RoundingMode.CEILING)] = true;
                }
                this.f4653h = zArr;
                this.f4654i = z7;
            } catch (ArithmeticException e7) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
            }
        }
    }

    /* JADX INFO: renamed from: R3.a$b */
    static final class b extends e {

        /* JADX INFO: renamed from: h */
        final char[] f4655h;

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // p136R3.AbstractC1331a.e, p136R3.AbstractC1331a
        /* JADX INFO: renamed from: d */
        int mo5696d(byte[] bArr, CharSequence charSequence) throws d {
            AbstractC1209m.m5302n(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < charSequence.length()) {
                bArr[i8] = (byte) ((this.f4656f.m5706c(charSequence.charAt(i7)) << 4) | this.f4656f.m5706c(charSequence.charAt(i7 + 1)));
                i7 += 2;
                i8++;
            }
            return i8;
        }

        @Override // p136R3.AbstractC1331a.e, p136R3.AbstractC1331a
        /* JADX INFO: renamed from: g */
        void mo5699g(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
            AbstractC1209m.m5302n(appendable);
            AbstractC1209m.m5307s(i7, i7 + i8, bArr.length);
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = bArr[i7 + i9] & 255;
                appendable.append(this.f4655h[i10]);
                appendable.append(this.f4655h[i10 | 256]);
            }
        }

        @Override // p136R3.AbstractC1331a.e
        /* JADX INFO: renamed from: n */
        AbstractC1331a mo5710n(a aVar, Character ch) {
            return new b(aVar);
        }

        private b(a aVar) {
            super(aVar, null);
            this.f4655h = new char[512];
            AbstractC1209m.m5292d(aVar.f4647b.length == 16);
            for (int i7 = 0; i7 < 256; i7++) {
                this.f4655h[i7] = aVar.m5707d(i7 >>> 4);
                this.f4655h[i7 | 256] = aVar.m5707d(i7 & 15);
            }
        }
    }

    /* JADX INFO: renamed from: R3.a$c */
    static final class c extends e {
        c(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // p136R3.AbstractC1331a.e, p136R3.AbstractC1331a
        /* JADX INFO: renamed from: d */
        int mo5696d(byte[] bArr, CharSequence charSequence) throws d {
            AbstractC1209m.m5302n(bArr);
            CharSequence charSequenceMo5703l = mo5703l(charSequence);
            if (!this.f4656f.m5708e(charSequenceMo5703l.length())) {
                throw new d("Invalid input length " + charSequenceMo5703l.length());
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < charSequenceMo5703l.length()) {
                int i9 = i7 + 2;
                int iM5706c = (this.f4656f.m5706c(charSequenceMo5703l.charAt(i7)) << 18) | (this.f4656f.m5706c(charSequenceMo5703l.charAt(i7 + 1)) << 12);
                int i10 = i8 + 1;
                bArr[i8] = (byte) (iM5706c >>> 16);
                if (i9 < charSequenceMo5703l.length()) {
                    int i11 = i7 + 3;
                    int iM5706c2 = iM5706c | (this.f4656f.m5706c(charSequenceMo5703l.charAt(i9)) << 6);
                    int i12 = i8 + 2;
                    bArr[i10] = (byte) ((iM5706c2 >>> 8) & 255);
                    if (i11 < charSequenceMo5703l.length()) {
                        i7 += 4;
                        i8 += 3;
                        bArr[i12] = (byte) ((iM5706c2 | this.f4656f.m5706c(charSequenceMo5703l.charAt(i11))) & 255);
                    } else {
                        i8 = i12;
                        i7 = i11;
                    }
                } else {
                    i8 = i10;
                    i7 = i9;
                }
            }
            return i8;
        }

        @Override // p136R3.AbstractC1331a.e, p136R3.AbstractC1331a
        /* JADX INFO: renamed from: g */
        void mo5699g(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
            AbstractC1209m.m5302n(appendable);
            int i9 = i7 + i8;
            AbstractC1209m.m5307s(i7, i9, bArr.length);
            while (i8 >= 3) {
                int i10 = i7 + 2;
                int i11 = ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7] & 255) << 16);
                i7 += 3;
                int i12 = i11 | (bArr[i10] & 255);
                appendable.append(this.f4656f.m5707d(i12 >>> 18));
                appendable.append(this.f4656f.m5707d((i12 >>> 12) & 63));
                appendable.append(this.f4656f.m5707d((i12 >>> 6) & 63));
                appendable.append(this.f4656f.m5707d(i12 & 63));
                i8 -= 3;
            }
            if (i7 < i9) {
                m5711m(appendable, bArr, i7, i9 - i7);
            }
        }

        @Override // p136R3.AbstractC1331a.e
        /* JADX INFO: renamed from: n */
        AbstractC1331a mo5710n(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        private c(a aVar, Character ch) {
            super(aVar, ch);
            AbstractC1209m.m5292d(aVar.f4647b.length == 64);
        }
    }

    /* JADX INFO: renamed from: R3.a$d */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: R3.a$e */
    static class e extends AbstractC1331a {

        /* JADX INFO: renamed from: f */
        final a f4656f;

        /* JADX INFO: renamed from: g */
        final Character f4657g;

        e(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // p136R3.AbstractC1331a
        /* JADX INFO: renamed from: d */
        int mo5696d(byte[] bArr, CharSequence charSequence) throws d {
            a aVar;
            AbstractC1209m.m5302n(bArr);
            CharSequence charSequenceMo5703l = mo5703l(charSequence);
            if (!this.f4656f.m5708e(charSequenceMo5703l.length())) {
                throw new d("Invalid input length " + charSequenceMo5703l.length());
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < charSequenceMo5703l.length()) {
                long jM5706c = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    aVar = this.f4656f;
                    if (i9 >= aVar.f4650e) {
                        break;
                    }
                    jM5706c <<= aVar.f4649d;
                    if (i7 + i9 < charSequenceMo5703l.length()) {
                        jM5706c |= (long) this.f4656f.m5706c(charSequenceMo5703l.charAt(i10 + i7));
                        i10++;
                    }
                    i9++;
                }
                int i11 = aVar.f4651f;
                int i12 = (i11 * 8) - (i10 * aVar.f4649d);
                int i13 = (i11 - 1) * 8;
                while (i13 >= i12) {
                    bArr[i8] = (byte) ((jM5706c >>> i13) & 255);
                    i13 -= 8;
                    i8++;
                }
                i7 += this.f4656f.f4650e;
            }
            return i8;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f4656f.equals(eVar.f4656f) && Objects.equals(this.f4657g, eVar.f4657g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p136R3.AbstractC1331a
        /* JADX INFO: renamed from: g */
        void mo5699g(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
            AbstractC1209m.m5302n(appendable);
            AbstractC1209m.m5307s(i7, i7 + i8, bArr.length);
            int i9 = 0;
            while (i9 < i8) {
                m5711m(appendable, bArr, i7 + i9, Math.min(this.f4656f.f4651f, i8 - i9));
                i9 += this.f4656f.f4651f;
            }
        }

        public int hashCode() {
            return this.f4656f.hashCode() ^ Objects.hashCode(this.f4657g);
        }

        @Override // p136R3.AbstractC1331a
        /* JADX INFO: renamed from: i */
        int mo5700i(int i7) {
            return (int) (((((long) this.f4656f.f4649d) * ((long) i7)) + 7) / 8);
        }

        @Override // p136R3.AbstractC1331a
        /* JADX INFO: renamed from: j */
        int mo5701j(int i7) {
            a aVar = this.f4656f;
            return aVar.f4650e * AbstractC1413a.m6002a(i7, aVar.f4651f, RoundingMode.CEILING);
        }

        @Override // p136R3.AbstractC1331a
        /* JADX INFO: renamed from: k */
        public AbstractC1331a mo5702k() {
            return this.f4657g == null ? this : mo5710n(this.f4656f, null);
        }

        @Override // p136R3.AbstractC1331a
        /* JADX INFO: renamed from: l */
        CharSequence mo5703l(CharSequence charSequence) {
            AbstractC1209m.m5302n(charSequence);
            Character ch = this.f4657g;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* JADX INFO: renamed from: m */
        void m5711m(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
            AbstractC1209m.m5302n(appendable);
            AbstractC1209m.m5307s(i7, i7 + i8, bArr.length);
            int i9 = 0;
            AbstractC1209m.m5292d(i8 <= this.f4656f.f4651f);
            long j7 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                j7 = (j7 | ((long) (bArr[i7 + i10] & 255))) << 8;
            }
            int i11 = ((i8 + 1) * 8) - this.f4656f.f4649d;
            while (i9 < i8 * 8) {
                a aVar = this.f4656f;
                appendable.append(aVar.m5707d(((int) (j7 >>> (i11 - i9))) & aVar.f4648c));
                i9 += this.f4656f.f4649d;
            }
            if (this.f4657g != null) {
                while (i9 < this.f4656f.f4651f * 8) {
                    appendable.append(this.f4657g.charValue());
                    i9 += this.f4656f.f4649d;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        AbstractC1331a mo5710n(a aVar, Character ch) {
            return new e(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f4656f);
            if (8 % this.f4656f.f4649d != 0) {
                if (this.f4657g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f4657g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        e(a aVar, Character ch) {
            this.f4656f = (a) AbstractC1209m.m5302n(aVar);
            AbstractC1209m.m5298j(ch == null || !aVar.m5709f(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f4657g = ch;
        }
    }

    AbstractC1331a() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1331a m5692a() {
        return f4641a;
    }

    /* JADX INFO: renamed from: h */
    private static byte[] m5693h(byte[] bArr, int i7) {
        if (i7 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m5694b(CharSequence charSequence) {
        try {
            return m5695c(charSequence);
        } catch (d e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    final byte[] m5695c(CharSequence charSequence) {
        CharSequence charSequenceMo5703l = mo5703l(charSequence);
        byte[] bArr = new byte[mo5700i(charSequenceMo5703l.length())];
        return m5693h(bArr, mo5696d(bArr, charSequenceMo5703l));
    }

    /* JADX INFO: renamed from: d */
    abstract int mo5696d(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: e */
    public String m5697e(byte[] bArr) {
        return m5698f(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public final String m5698f(byte[] bArr, int i7, int i8) {
        AbstractC1209m.m5307s(i7, i7 + i8, bArr.length);
        StringBuilder sb = new StringBuilder(mo5701j(i8));
        try {
            mo5699g(sb, bArr, i7, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX INFO: renamed from: g */
    abstract void mo5699g(Appendable appendable, byte[] bArr, int i7, int i8);

    /* JADX INFO: renamed from: i */
    abstract int mo5700i(int i7);

    /* JADX INFO: renamed from: j */
    abstract int mo5701j(int i7);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC1331a mo5702k();

    /* JADX INFO: renamed from: l */
    abstract CharSequence mo5703l(CharSequence charSequence);
}
