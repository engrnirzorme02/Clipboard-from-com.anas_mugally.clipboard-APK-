package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.common.api.C3553a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: androidx.exifinterface.media.a */
/* JADX INFO: loaded from: classes.dex */
public class C2572a {

    /* JADX INFO: renamed from: T */
    private static SimpleDateFormat f9926T;

    /* JADX INFO: renamed from: U */
    private static SimpleDateFormat f9927U;

    /* JADX INFO: renamed from: Y */
    private static final d[] f9931Y;

    /* JADX INFO: renamed from: Z */
    private static final d[] f9932Z;

    /* JADX INFO: renamed from: a0 */
    private static final d[] f9933a0;

    /* JADX INFO: renamed from: b0 */
    private static final d[] f9934b0;

    /* JADX INFO: renamed from: c0 */
    private static final d[] f9935c0;

    /* JADX INFO: renamed from: d0 */
    private static final d f9936d0;

    /* JADX INFO: renamed from: e0 */
    private static final d[] f9937e0;

    /* JADX INFO: renamed from: f0 */
    private static final d[] f9938f0;

    /* JADX INFO: renamed from: g0 */
    private static final d[] f9939g0;

    /* JADX INFO: renamed from: h0 */
    private static final d[] f9940h0;

    /* JADX INFO: renamed from: i0 */
    static final d[][] f9941i0;

    /* JADX INFO: renamed from: j0 */
    private static final d[] f9942j0;

    /* JADX INFO: renamed from: k0 */
    private static final HashMap[] f9943k0;

    /* JADX INFO: renamed from: l0 */
    private static final HashMap[] f9944l0;

    /* JADX INFO: renamed from: m0 */
    private static final HashSet f9945m0;

    /* JADX INFO: renamed from: n0 */
    private static final HashMap f9946n0;

    /* JADX INFO: renamed from: o0 */
    static final Charset f9947o0;

    /* JADX INFO: renamed from: p0 */
    static final byte[] f9948p0;

    /* JADX INFO: renamed from: q0 */
    private static final byte[] f9949q0;

    /* JADX INFO: renamed from: r0 */
    private static final Pattern f9950r0;

    /* JADX INFO: renamed from: s0 */
    private static final Pattern f9951s0;

    /* JADX INFO: renamed from: t0 */
    private static final Pattern f9952t0;

    /* JADX INFO: renamed from: u0 */
    private static final Pattern f9954u0;

    /* JADX INFO: renamed from: a */
    private String f9960a;

    /* JADX INFO: renamed from: b */
    private FileDescriptor f9961b;

    /* JADX INFO: renamed from: c */
    private AssetManager.AssetInputStream f9962c;

    /* JADX INFO: renamed from: d */
    private int f9963d;

    /* JADX INFO: renamed from: e */
    private boolean f9964e;

    /* JADX INFO: renamed from: f */
    private final HashMap[] f9965f;

    /* JADX INFO: renamed from: g */
    private Set f9966g;

    /* JADX INFO: renamed from: h */
    private ByteOrder f9967h;

    /* JADX INFO: renamed from: i */
    private boolean f9968i;

    /* JADX INFO: renamed from: j */
    private boolean f9969j;

    /* JADX INFO: renamed from: k */
    private boolean f9970k;

    /* JADX INFO: renamed from: l */
    private int f9971l;

    /* JADX INFO: renamed from: m */
    private int f9972m;

    /* JADX INFO: renamed from: n */
    private byte[] f9973n;

    /* JADX INFO: renamed from: o */
    private int f9974o;

    /* JADX INFO: renamed from: p */
    private int f9975p;

    /* JADX INFO: renamed from: q */
    private int f9976q;

    /* JADX INFO: renamed from: r */
    private int f9977r;

    /* JADX INFO: renamed from: s */
    private int f9978s;

    /* JADX INFO: renamed from: t */
    private boolean f9979t;

    /* JADX INFO: renamed from: u */
    private static final boolean f9953u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v */
    private static final List f9955v = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: w */
    private static final List f9956w = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: x */
    public static final int[] f9957x = {8, 8, 8};

    /* JADX INFO: renamed from: y */
    public static final int[] f9958y = {4};

    /* JADX INFO: renamed from: z */
    public static final int[] f9959z = {8};

    /* JADX INFO: renamed from: A */
    static final byte[] f9907A = {-1, -40, -1};

    /* JADX INFO: renamed from: B */
    private static final byte[] f9908B = {102, 116, 121, 112};

    /* JADX INFO: renamed from: C */
    private static final byte[] f9909C = {109, 105, 102, 49};

    /* JADX INFO: renamed from: D */
    private static final byte[] f9910D = {104, 101, 105, 99};

    /* JADX INFO: renamed from: E */
    private static final byte[] f9911E = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: F */
    private static final byte[] f9912F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: G */
    private static final byte[] f9913G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: H */
    private static final byte[] f9914H = {101, 88, 73, 102};

    /* JADX INFO: renamed from: I */
    private static final byte[] f9915I = {73, 72, 68, 82};

    /* JADX INFO: renamed from: J */
    private static final byte[] f9916J = {73, 69, 78, 68};

    /* JADX INFO: renamed from: K */
    private static final byte[] f9917K = {82, 73, 70, 70};

    /* JADX INFO: renamed from: L */
    private static final byte[] f9918L = {87, 69, 66, 80};

    /* JADX INFO: renamed from: M */
    private static final byte[] f9919M = {69, 88, 73, 70};

    /* JADX INFO: renamed from: N */
    private static final byte[] f9920N = {-99, 1, 42};

    /* JADX INFO: renamed from: O */
    private static final byte[] f9921O = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: P */
    private static final byte[] f9922P = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q */
    private static final byte[] f9923Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R */
    private static final byte[] f9924R = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S */
    private static final byte[] f9925S = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: V */
    static final String[] f9928V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: W */
    static final int[] f9929W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: X */
    static final byte[] f9930X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a */
    class a extends MediaDataSource {

        /* JADX INFO: renamed from: a */
        long f9980a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ f f9981b;

        a(f fVar) {
            this.f9981b = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j7, byte[] bArr, int i7, int i8) {
            if (i8 == 0) {
                return 0;
            }
            if (j7 < 0) {
                return -1;
            }
            try {
                long j8 = this.f9980a;
                if (j8 != j7) {
                    if (j8 >= 0 && j7 >= j8 + ((long) this.f9981b.available())) {
                        return -1;
                    }
                    this.f9981b.m11926J(j7);
                    this.f9980a = j7;
                }
                if (i8 > this.f9981b.available()) {
                    i8 = this.f9981b.available();
                }
                int i9 = this.f9981b.read(bArr, i7, i8);
                if (i9 >= 0) {
                    this.f9980a += (long) i9;
                    return i9;
                }
            } catch (IOException unused) {
            }
            this.f9980a = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$b */
    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e */
        private static final ByteOrder f9983e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f */
        private static final ByteOrder f9984f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a */
        final DataInputStream f9985a;

        /* JADX INFO: renamed from: b */
        private ByteOrder f9986b;

        /* JADX INFO: renamed from: c */
        int f9987c;

        /* JADX INFO: renamed from: d */
        private byte[] f9988d;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f9985a.available();
        }

        /* JADX INFO: renamed from: d */
        public int m11909d() {
            return this.f9987c;
        }

        /* JADX INFO: renamed from: m */
        public long m11910m() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public void mark(int i7) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* JADX INFO: renamed from: n */
        public void m11911n(ByteOrder byteOrder) {
            this.f9986b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f9987c++;
            return this.f9985a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f9987c++;
            return this.f9985a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f9987c++;
            int i7 = this.f9985a.read();
            if (i7 >= 0) {
                return (byte) i7;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f9987c += 2;
            return this.f9985a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i7, int i8) throws IOException {
            this.f9987c += i8;
            this.f9985a.readFully(bArr, i7, i8);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f9987c += 4;
            int i7 = this.f9985a.read();
            int i8 = this.f9985a.read();
            int i9 = this.f9985a.read();
            int i10 = this.f9985a.read();
            if ((i7 | i8 | i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9986b;
            if (byteOrder == f9983e) {
                return (i10 << 24) + (i9 << 16) + (i8 << 8) + i7;
            }
            if (byteOrder == f9984f) {
                return (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
            }
            throw new IOException("Invalid byte order: " + this.f9986b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f9987c += 8;
            int i7 = this.f9985a.read();
            int i8 = this.f9985a.read();
            int i9 = this.f9985a.read();
            int i10 = this.f9985a.read();
            int i11 = this.f9985a.read();
            int i12 = this.f9985a.read();
            int i13 = this.f9985a.read();
            int i14 = this.f9985a.read();
            if ((i7 | i8 | i9 | i10 | i11 | i12 | i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9986b;
            if (byteOrder == f9983e) {
                return (((long) i14) << 56) + (((long) i13) << 48) + (((long) i12) << 40) + (((long) i11) << 32) + (((long) i10) << 24) + (((long) i9) << 16) + (((long) i8) << 8) + ((long) i7);
            }
            if (byteOrder == f9984f) {
                return (((long) i7) << 56) + (((long) i8) << 48) + (((long) i9) << 40) + (((long) i10) << 32) + (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
            }
            throw new IOException("Invalid byte order: " + this.f9986b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f9987c += 2;
            int i7 = this.f9985a.read();
            int i8 = this.f9985a.read();
            if ((i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9986b;
            if (byteOrder == f9983e) {
                return (short) ((i8 << 8) + i7);
            }
            if (byteOrder == f9984f) {
                return (short) ((i7 << 8) + i8);
            }
            throw new IOException("Invalid byte order: " + this.f9986b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f9987c += 2;
            return this.f9985a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f9987c++;
            return this.f9985a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f9987c += 2;
            int i7 = this.f9985a.read();
            int i8 = this.f9985a.read();
            if ((i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9986b;
            if (byteOrder == f9983e) {
                return (i8 << 8) + i7;
            }
            if (byteOrder == f9984f) {
                return (i7 << 8) + i8;
            }
            throw new IOException("Invalid byte order: " + this.f9986b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i7) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* JADX INFO: renamed from: x */
        public void m11912x(int i7) throws IOException {
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i7 - i8;
                int iSkip = (int) this.f9985a.skip(i9);
                if (iSkip <= 0) {
                    if (this.f9988d == null) {
                        this.f9988d = new byte[8192];
                    }
                    iSkip = this.f9985a.read(this.f9988d, 0, Math.min(8192, i9));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i7 + " bytes.");
                    }
                }
                i8 += iSkip;
            }
            this.f9987c += i8;
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f9986b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f9985a = dataInputStream;
            dataInputStream.mark(0);
            this.f9987c = 0;
            this.f9986b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.f9985a.read(bArr, i7, i8);
            this.f9987c += i9;
            return i9;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f9987c += bArr.length;
            this.f9985a.readFully(bArr);
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        public final int f9989a;

        /* JADX INFO: renamed from: b */
        public final int f9990b;

        /* JADX INFO: renamed from: c */
        public final long f9991c;

        /* JADX INFO: renamed from: d */
        public final byte[] f9992d;

        c(int i7, int i8, byte[] bArr) {
            this(i7, i8, -1L, bArr);
        }

        /* JADX INFO: renamed from: a */
        public static c m11913a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C2572a.f9947o0);
            return new c(2, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: b */
        public static c m11914b(long j7, ByteOrder byteOrder) {
            return m11915c(new long[]{j7}, byteOrder);
        }

        /* JADX INFO: renamed from: c */
        public static c m11915c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2572a.f9929W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j7 : jArr) {
                byteBufferWrap.putInt((int) j7);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: d */
        public static c m11916d(e eVar, ByteOrder byteOrder) {
            return m11917e(new e[]{eVar}, byteOrder);
        }

        /* JADX INFO: renamed from: e */
        public static c m11917e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2572a.f9929W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f9997a);
                byteBufferWrap.putInt((int) eVar.f9998b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: f */
        public static c m11918f(int i7, ByteOrder byteOrder) {
            return m11919g(new int[]{i7}, byteOrder);
        }

        /* JADX INFO: renamed from: g */
        public static c m11919g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2572a.f9929W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i7 : iArr) {
                byteBufferWrap.putShort((short) i7);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: h */
        public double m11920h(ByteOrder byteOrder) throws Throwable {
            Object objM11923k = m11923k(byteOrder);
            if (objM11923k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM11923k instanceof String) {
                return Double.parseDouble((String) objM11923k);
            }
            if (objM11923k instanceof long[]) {
                long[] jArr = (long[]) objM11923k;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM11923k instanceof int[]) {
                int[] iArr = (int[]) objM11923k;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM11923k instanceof double[]) {
                double[] dArr = (double[]) objM11923k;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM11923k instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objM11923k;
            if (eVarArr.length == 1) {
                return eVarArr[0].m11925a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: i */
        public int m11921i(ByteOrder byteOrder) throws Throwable {
            Object objM11923k = m11923k(byteOrder);
            if (objM11923k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM11923k instanceof String) {
                return Integer.parseInt((String) objM11923k);
            }
            if (objM11923k instanceof long[]) {
                long[] jArr = (long[]) objM11923k;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM11923k instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM11923k;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: j */
        public String m11922j(ByteOrder byteOrder) throws Throwable {
            Object objM11923k = m11923k(byteOrder);
            if (objM11923k == null) {
                return null;
            }
            if (objM11923k instanceof String) {
                return (String) objM11923k;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            if (objM11923k instanceof long[]) {
                long[] jArr = (long[]) objM11923k;
                while (i7 < jArr.length) {
                    sb.append(jArr[i7]);
                    i7++;
                    if (i7 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM11923k instanceof int[]) {
                int[] iArr = (int[]) objM11923k;
                while (i7 < iArr.length) {
                    sb.append(iArr[i7]);
                    i7++;
                    if (i7 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objM11923k instanceof double[]) {
                double[] dArr = (double[]) objM11923k;
                while (i7 < dArr.length) {
                    sb.append(dArr[i7]);
                    i7++;
                    if (i7 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objM11923k instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objM11923k;
            while (i7 < eVarArr.length) {
                sb.append(eVarArr[i7].f9997a);
                sb.append('/');
                sb.append(eVarArr[i7].f9998b);
                i7++;
                if (i7 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
        /* JADX INFO: renamed from: k */
        Object m11923k(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b7;
            byte b8;
            int length = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f9992d);
                    try {
                        bVar.m11911n(byteOrder);
                        switch (this.f9989a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f9992d;
                                if (bArr.length != 1 || (b7 = bArr[0]) < 0 || b7 > 1) {
                                    String str = new String(bArr, C2572a.f9947o0);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e7) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b7 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (this.f9990b >= C2572a.f9930X.length) {
                                    int i7 = 0;
                                    while (true) {
                                        byte[] bArr2 = C2572a.f9930X;
                                        if (i7 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (this.f9992d[i7] == bArr2[i7]) {
                                            i7++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f9990b && (b8 = this.f9992d[length]) != 0) {
                                    if (b8 >= 32) {
                                        sb.append((char) b8);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    bVar.close();
                                    return string;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return string;
                                }
                            case 3:
                                int[] iArr = new int[this.f9990b];
                                while (length < this.f9990b) {
                                    iArr[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return iArr;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return iArr;
                                }
                            case 4:
                                long[] jArr = new long[this.f9990b];
                                while (length < this.f9990b) {
                                    jArr[length] = bVar.m11910m();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return jArr;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return jArr;
                                }
                            case 5:
                                e[] eVarArr = new e[this.f9990b];
                                while (length < this.f9990b) {
                                    eVarArr[length] = new e(bVar.m11910m(), bVar.m11910m());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return eVarArr;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return eVarArr;
                                }
                            case 8:
                                int[] iArr2 = new int[this.f9990b];
                                while (length < this.f9990b) {
                                    iArr2[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return iArr2;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return iArr2;
                                }
                            case 9:
                                int[] iArr3 = new int[this.f9990b];
                                while (length < this.f9990b) {
                                    iArr3[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return iArr3;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return iArr3;
                                }
                            case 10:
                                e[] eVarArr2 = new e[this.f9990b];
                                while (length < this.f9990b) {
                                    eVarArr2[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return eVarArr2;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return eVarArr2;
                                }
                            case 11:
                                double[] dArr = new double[this.f9990b];
                                while (length < this.f9990b) {
                                    dArr[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return dArr;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return dArr;
                                }
                            case 12:
                                double[] dArr2 = new double[this.f9990b];
                                while (length < this.f9990b) {
                                    dArr2[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return dArr2;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return dArr2;
                                }
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                    return null;
                                }
                        }
                    } catch (IOException e19) {
                        e = e19;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e20) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e21) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                        }
                    }
                    throw th;
                }
            } catch (IOException e22) {
                e = e22;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public String toString() {
            return "(" + C2572a.f9928V[this.f9989a] + ", data length:" + this.f9992d.length + ")";
        }

        c(int i7, int i8, long j7, byte[] bArr) {
            this.f9989a = i7;
            this.f9990b = i8;
            this.f9991c = j7;
            this.f9992d = bArr;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$e */
    private static class e {

        /* JADX INFO: renamed from: a */
        public final long f9997a;

        /* JADX INFO: renamed from: b */
        public final long f9998b;

        e(long j7, long j8) {
            if (j8 == 0) {
                this.f9997a = 0L;
                this.f9998b = 1L;
            } else {
                this.f9997a = j7;
                this.f9998b = j8;
            }
        }

        /* JADX INFO: renamed from: a */
        public double m11925a() {
            return this.f9997a / this.f9998b;
        }

        public String toString() {
            return this.f9997a + "/" + this.f9998b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f9931Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f9932Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f9933a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f9934b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f9935c0 = dVarArr5;
        f9936d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f9937e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f9938f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f9939g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f9940h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f9941i0 = dVarArr10;
        f9942j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f9943k0 = new HashMap[dVarArr10.length];
        f9944l0 = new HashMap[dVarArr10.length];
        f9945m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f9946n0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f9947o0 = charsetForName;
        f9948p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f9949q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f9926T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f9927U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            d[][] dVarArr11 = f9941i0;
            if (i7 >= dVarArr11.length) {
                HashMap map = f9946n0;
                d[] dVarArr12 = f9942j0;
                map.put(Integer.valueOf(dVarArr12[0].f9993a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f9993a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f9993a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f9993a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f9993a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f9993a), 8);
                f9950r0 = Pattern.compile(".*[1-9].*");
                f9951s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f9952t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f9954u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f9943k0[i7] = new HashMap();
            f9944l0[i7] = new HashMap();
            for (d dVar : dVarArr11[i7]) {
                f9943k0[i7].put(Integer.valueOf(dVar.f9993a), dVar);
                f9944l0[i7].put(dVar.f9994b, dVar);
            }
            i7++;
        }
    }

    public C2572a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX INFO: renamed from: A */
    private boolean m11869A(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f9917K;
            if (i7 >= bArr2.length) {
                int i8 = 0;
                while (true) {
                    byte[] bArr3 = f9918L;
                    if (i8 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f9917K.length + i8 + 4] != bArr3[i8]) {
                        return false;
                    }
                    i8++;
                }
            } else {
                if (bArr[i7] != bArr2[i7]) {
                    return false;
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    private void m11870B(InputStream inputStream) {
        boolean z7;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i7 = 0; i7 < f9941i0.length; i7++) {
            try {
                try {
                    this.f9965f[i7] = new HashMap();
                } catch (Throwable th) {
                    m11883a();
                    if (f9953u) {
                        m11872D();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                z7 = f9953u;
                if (z7) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m11883a();
                if (z7) {
                    m11872D();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e8) {
                e = e8;
                z7 = f9953u;
                if (z7) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m11883a();
                if (z7) {
                    m11872D();
                    return;
                }
                return;
            }
        }
        if (!this.f9964e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f9963d = m11887g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m11879K(this.f9963d)) {
            f fVar = new f(inputStream);
            if (this.f9964e) {
                m11893m(fVar);
            } else {
                int i8 = this.f9963d;
                if (i8 == 12) {
                    m11885e(fVar);
                } else if (i8 == 7) {
                    m11888h(fVar);
                } else if (i8 == 10) {
                    m11892l(fVar);
                } else {
                    m11891k(fVar);
                }
            }
            fVar.m11926J(this.f9975p);
            m11878J(fVar);
        } else {
            b bVar = new b(inputStream);
            int i9 = this.f9963d;
            if (i9 == 4) {
                m11886f(bVar, 0, 0);
            } else if (i9 == 13) {
                m11889i(bVar);
            } else if (i9 == 9) {
                m11890j(bVar);
            } else if (i9 == 14) {
                m11894n(bVar);
            }
        }
        m11883a();
        if (f9953u) {
            m11872D();
        }
    }

    /* JADX INFO: renamed from: C */
    private void m11871C(b bVar) throws IOException {
        ByteOrder byteOrderM11873E = m11873E(bVar);
        this.f9967h = byteOrderM11873E;
        bVar.m11911n(byteOrderM11873E);
        int unsignedShort = bVar.readUnsignedShort();
        int i7 = this.f9963d;
        if (i7 != 7 && i7 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i8 = bVar.readInt();
        if (i8 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i8);
        }
        int i9 = i8 - 8;
        if (i9 > 0) {
            bVar.m11912x(i9);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m11872D() {
        for (int i7 = 0; i7 < this.f9965f.length; i7++) {
            Log.d("ExifInterface", "The size of tag group[" + i7 + "]: " + this.f9965f[i7].size());
            for (Map.Entry entry : this.f9965f[i7].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.m11922j(this.f9967h) + "'");
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private ByteOrder m11873E(b bVar) throws IOException {
        short s7 = bVar.readShort();
        if (s7 == 18761) {
            if (f9953u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s7 == 19789) {
            if (f9953u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s7));
    }

    /* JADX INFO: renamed from: F */
    private void m11874F(byte[] bArr, int i7) throws IOException {
        f fVar = new f(bArr);
        m11871C(fVar);
        m11875G(fVar, i7);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:113:0x0303  */
    /* JADX WARN: Code duplicated, block: B:140:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x015b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01db  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0204  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
    /* JADX WARN: Code duplicated, block: B:83:0x021a  */
    /* JADX WARN: Code duplicated, block: B:84:0x021f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0226  */
    /* JADX WARN: Code duplicated, block: B:89:0x023d  */
    /* JADX WARN: Code duplicated, block: B:91:0x024a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0255 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0257  */
    /* JADX WARN: Code duplicated, block: B:94:0x0279 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x027b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0294  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c1  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0142, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01db, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x0257, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x027b, please report this as an issue */
    /* JADX INFO: renamed from: G */
    private void m11875G(f fVar, int i7) throws IOException {
        int i8;
        d dVar;
        long j7;
        boolean z7;
        boolean z8;
        d dVar2;
        Integer num;
        int unsignedShort;
        long jM11910m;
        int i9;
        this.f9966g.add(Integer.valueOf(fVar.f9987c));
        short s7 = fVar.readShort();
        if (f9953u) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s7));
        }
        if (s7 <= 0) {
            return;
        }
        short s8 = 0;
        while (s8 < s7) {
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i10 = fVar.readInt();
            long jM11909d = ((long) fVar.m11909d()) + 4;
            d dVar3 = (d) f9943k0[i7].get(Integer.valueOf(unsignedShort2));
            boolean z9 = f9953u;
            if (z9) {
                i8 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(unsignedShort2), dVar3 != null ? dVar3.f9994b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i10)));
            } else {
                i8 = 4;
            }
            if (dVar3 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f9929W;
                    if (unsignedShort3 < iArr.length) {
                        if (dVar3.m11924a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = dVar3.f9995c;
                            }
                            dVar = dVar3;
                            j7 = ((long) i10) * ((long) iArr[unsignedShort3]);
                            if (j7 < 0 || j7 > 2147483647L) {
                                if (z9) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i10);
                                }
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                        } else if (z9) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f9928V[unsignedShort3] + ") is unexpected for tag: " + dVar3.f9994b);
                        }
                    }
                    if (z7) {
                        if (j7 > 4) {
                            i9 = fVar.readInt();
                            if (z9) {
                                Log.d("ExifInterface", "seek to data offset: " + i9);
                            }
                            if (this.f9963d == 7) {
                                dVar2 = dVar;
                                z8 = z9;
                                if ("MakerNote".equals(dVar2.f9994b)) {
                                    this.f9976q = i9;
                                } else if (i7 != 6 && "ThumbnailImage".equals(dVar2.f9994b)) {
                                    this.f9977r = i9;
                                    this.f9978s = i10;
                                    c cVarM11918f = c.m11918f(6, this.f9967h);
                                    c cVarM11914b = c.m11914b(this.f9977r, this.f9967h);
                                    c cVarM11914b2 = c.m11914b(this.f9978s, this.f9967h);
                                    this.f9965f[i8].put("Compression", cVarM11918f);
                                    this.f9965f[i8].put("JPEGInterchangeFormat", cVarM11914b);
                                    this.f9965f[i8].put("JPEGInterchangeFormatLength", cVarM11914b2);
                                }
                            } else {
                                z8 = z9;
                                dVar2 = dVar;
                            }
                            fVar.m11926J(i9);
                        } else {
                            z8 = z9;
                            unsignedShort2 = unsignedShort2;
                            i10 = i10;
                            dVar2 = dVar;
                        }
                        num = (Integer) f9946n0.get(Integer.valueOf(unsignedShort2));
                        if (z8) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j7);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i8) {
                                    jM11910m = fVar.m11910m();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    jM11910m = -1;
                                }
                                if (z8) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM11910m), dVar2.f9994b));
                                }
                                if (jM11910m > 0) {
                                    if (!this.f9966g.contains(Integer.valueOf((int) jM11910m))) {
                                        fVar.m11926J(jM11910m);
                                        m11875G(fVar, num.intValue());
                                    } else if (z8) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM11910m + ")");
                                    }
                                } else if (z8) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM11910m);
                                }
                                fVar.m11926J(jM11909d);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            jM11910m = unsignedShort;
                            if (z8) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM11910m), dVar2.f9994b));
                            }
                            if (jM11910m > 0) {
                                if (!this.f9966g.contains(Integer.valueOf((int) jM11910m))) {
                                    fVar.m11926J(jM11910m);
                                    m11875G(fVar, num.intValue());
                                } else if (z8) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM11910m + ")");
                                }
                            } else if (z8) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM11910m);
                            }
                            fVar.m11926J(jM11909d);
                        } else {
                            int iM11909d = fVar.m11909d() + this.f9975p;
                            byte[] bArr = new byte[(int) j7];
                            fVar.readFully(bArr);
                            c cVar = new c(unsignedShort3, i10, iM11909d, bArr);
                            this.f9965f[i7].put(dVar2.f9994b, cVar);
                            if ("DNGVersion".equals(dVar2.f9994b)) {
                                this.f9963d = 3;
                            }
                            if (((!"Make".equals(dVar2.f9994b) || "Model".equals(dVar2.f9994b)) && cVar.m11922j(this.f9967h).contains("PENTAX")) || ("Compression".equals(dVar2.f9994b) && cVar.m11921i(this.f9967h) == 65535)) {
                                this.f9963d = 8;
                            }
                            if (fVar.m11909d() != jM11909d) {
                                fVar.m11926J(jM11909d);
                            }
                        }
                    } else {
                        fVar.m11926J(jM11909d);
                    }
                    s8 = (short) (s8 + 1);
                    s7 = s7;
                }
                dVar = dVar3;
                if (z9) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j7 = 0;
                z7 = false;
                if (z7) {
                    fVar.m11926J(jM11909d);
                } else {
                    if (j7 > 4) {
                        i9 = fVar.readInt();
                        if (z9) {
                            Log.d("ExifInterface", "seek to data offset: " + i9);
                        }
                        if (this.f9963d == 7) {
                            dVar2 = dVar;
                            z8 = z9;
                            if ("MakerNote".equals(dVar2.f9994b)) {
                                this.f9976q = i9;
                            } else if (i7 != 6) {
                            }
                        } else {
                            z8 = z9;
                            dVar2 = dVar;
                        }
                        fVar.m11926J(i9);
                    } else {
                        z8 = z9;
                        unsignedShort2 = unsignedShort2;
                        i10 = i10;
                        dVar2 = dVar;
                    }
                    num = (Integer) f9946n0.get(Integer.valueOf(unsignedShort2));
                    if (z8) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j7);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i8) {
                                jM11910m = fVar.m11910m();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z8) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM11910m), dVar2.f9994b));
                            }
                            if (jM11910m > 0) {
                                if (!this.f9966g.contains(Integer.valueOf((int) jM11910m))) {
                                    fVar.m11926J(jM11910m);
                                    m11875G(fVar, num.intValue());
                                } else if (z8) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM11910m + ")");
                                }
                            } else if (z8) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM11910m);
                            }
                            fVar.m11926J(jM11909d);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        jM11910m = unsignedShort;
                        if (z8) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM11910m), dVar2.f9994b));
                        }
                        if (jM11910m > 0) {
                            if (!this.f9966g.contains(Integer.valueOf((int) jM11910m))) {
                                fVar.m11926J(jM11910m);
                                m11875G(fVar, num.intValue());
                            } else if (z8) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM11910m + ")");
                            }
                        } else if (z8) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM11910m);
                        }
                        fVar.m11926J(jM11909d);
                    } else {
                        int iM11909d2 = fVar.m11909d() + this.f9975p;
                        byte[] bArr2 = new byte[(int) j7];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(unsignedShort3, i10, iM11909d2, bArr2);
                        this.f9965f[i7].put(dVar2.f9994b, cVar2);
                        if ("DNGVersion".equals(dVar2.f9994b)) {
                            this.f9963d = 3;
                        }
                        if (!"Make".equals(dVar2.f9994b)) {
                        }
                        this.f9963d = 8;
                        if (fVar.m11909d() != jM11909d) {
                            fVar.m11926J(jM11909d);
                        }
                    }
                }
                s8 = (short) (s8 + 1);
                s7 = s7;
            } else if (z9) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            dVar = dVar3;
            j7 = 0;
            z7 = false;
            if (z7) {
                fVar.m11926J(jM11909d);
            } else {
                if (j7 > 4) {
                    i9 = fVar.readInt();
                    if (z9) {
                        Log.d("ExifInterface", "seek to data offset: " + i9);
                    }
                    if (this.f9963d == 7) {
                        dVar2 = dVar;
                        z8 = z9;
                        if ("MakerNote".equals(dVar2.f9994b)) {
                            this.f9976q = i9;
                        } else if (i7 != 6) {
                        }
                    } else {
                        z8 = z9;
                        dVar2 = dVar;
                    }
                    fVar.m11926J(i9);
                } else {
                    z8 = z9;
                    unsignedShort2 = unsignedShort2;
                    i10 = i10;
                    dVar2 = dVar;
                }
                num = (Integer) f9946n0.get(Integer.valueOf(unsignedShort2));
                if (z8) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j7);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i8) {
                            jM11910m = fVar.m11910m();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z8) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM11910m), dVar2.f9994b));
                        }
                        if (jM11910m > 0) {
                            if (!this.f9966g.contains(Integer.valueOf((int) jM11910m))) {
                                fVar.m11926J(jM11910m);
                                m11875G(fVar, num.intValue());
                            } else if (z8) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM11910m + ")");
                            }
                        } else if (z8) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM11910m);
                        }
                        fVar.m11926J(jM11909d);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    jM11910m = unsignedShort;
                    if (z8) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jM11910m), dVar2.f9994b));
                    }
                    if (jM11910m > 0) {
                        if (!this.f9966g.contains(Integer.valueOf((int) jM11910m))) {
                            fVar.m11926J(jM11910m);
                            m11875G(fVar, num.intValue());
                        } else if (z8) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jM11910m + ")");
                        }
                    } else if (z8) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + jM11910m);
                    }
                    fVar.m11926J(jM11909d);
                } else {
                    int iM11909d3 = fVar.m11909d() + this.f9975p;
                    byte[] bArr3 = new byte[(int) j7];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(unsignedShort3, i10, iM11909d3, bArr3);
                    this.f9965f[i7].put(dVar2.f9994b, cVar3);
                    if ("DNGVersion".equals(dVar2.f9994b)) {
                        this.f9963d = 3;
                    }
                    if (!"Make".equals(dVar2.f9994b)) {
                    }
                    this.f9963d = 8;
                    if (fVar.m11909d() != jM11909d) {
                        fVar.m11926J(jM11909d);
                    }
                }
            }
            s8 = (short) (s8 + 1);
            s7 = s7;
        }
        int i11 = fVar.readInt();
        boolean z10 = f9953u;
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j8 = i11;
        if (j8 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (this.f9966g.contains(Integer.valueOf(i11))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        fVar.m11926J(j8);
        if (this.f9965f[4].isEmpty()) {
            m11875G(fVar, 4);
        } else if (this.f9965f[5].isEmpty()) {
            m11875G(fVar, 5);
        }
    }

    /* JADX INFO: renamed from: H */
    private void m11876H(int i7, String str, String str2) {
        if (this.f9965f[i7].isEmpty() || this.f9965f[i7].get(str) == null) {
            return;
        }
        HashMap map = this.f9965f[i7];
        map.put(str2, map.get(str));
        this.f9965f[i7].remove(str);
    }

    /* JADX INFO: renamed from: I */
    private void m11877I(f fVar, int i7) throws Throwable {
        c cVar = (c) this.f9965f[i7].get("ImageLength");
        c cVar2 = (c) this.f9965f[i7].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f9965f[i7].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f9965f[i7].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int iM11921i = cVar3.m11921i(this.f9967h);
            int iM11921i2 = cVar3.m11921i(this.f9967h);
            fVar.m11926J(iM11921i);
            byte[] bArr = new byte[iM11921i2];
            fVar.read(bArr);
            m11886f(new b(bArr), iM11921i, i7);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m11878J(b bVar) throws Throwable {
        HashMap map = this.f9965f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f9974o = 6;
            m11895o(bVar, map);
            return;
        }
        int iM11921i = cVar.m11921i(this.f9967h);
        this.f9974o = iM11921i;
        if (iM11921i != 1) {
            if (iM11921i == 6) {
                m11895o(bVar, map);
                return;
            } else if (iM11921i != 7) {
                return;
            }
        }
        if (m11905y(map)) {
            m11896p(bVar, map);
        }
    }

    /* JADX INFO: renamed from: K */
    private static boolean m11879K(int i7) {
        return (i7 == 4 || i7 == 9 || i7 == 13 || i7 == 14) ? false : true;
    }

    /* JADX INFO: renamed from: L */
    private void m11880L(int i7, int i8) throws Throwable {
        if (this.f9965f[i7].isEmpty() || this.f9965f[i8].isEmpty()) {
            if (f9953u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f9965f[i7].get("ImageLength");
        c cVar2 = (c) this.f9965f[i7].get("ImageWidth");
        c cVar3 = (c) this.f9965f[i8].get("ImageLength");
        c cVar4 = (c) this.f9965f[i8].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f9953u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f9953u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM11921i = cVar.m11921i(this.f9967h);
        int iM11921i2 = cVar2.m11921i(this.f9967h);
        int iM11921i3 = cVar3.m11921i(this.f9967h);
        int iM11921i4 = cVar4.m11921i(this.f9967h);
        if (iM11921i >= iM11921i3 || iM11921i2 >= iM11921i4) {
            return;
        }
        HashMap[] mapArr = this.f9965f;
        HashMap map = mapArr[i7];
        mapArr[i7] = mapArr[i8];
        mapArr[i8] = map;
    }

    /* JADX INFO: renamed from: M */
    private void m11881M(f fVar, int i7) throws Throwable {
        c cVarM11918f;
        c cVarM11918f2;
        c cVar = (c) this.f9965f[i7].get("DefaultCropSize");
        c cVar2 = (c) this.f9965f[i7].get("SensorTopBorder");
        c cVar3 = (c) this.f9965f[i7].get("SensorLeftBorder");
        c cVar4 = (c) this.f9965f[i7].get("SensorBottomBorder");
        c cVar5 = (c) this.f9965f[i7].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                m11877I(fVar, i7);
                return;
            }
            int iM11921i = cVar2.m11921i(this.f9967h);
            int iM11921i2 = cVar4.m11921i(this.f9967h);
            int iM11921i3 = cVar5.m11921i(this.f9967h);
            int iM11921i4 = cVar3.m11921i(this.f9967h);
            if (iM11921i2 <= iM11921i || iM11921i3 <= iM11921i4) {
                return;
            }
            c cVarM11918f3 = c.m11918f(iM11921i2 - iM11921i, this.f9967h);
            c cVarM11918f4 = c.m11918f(iM11921i3 - iM11921i4, this.f9967h);
            this.f9965f[i7].put("ImageLength", cVarM11918f3);
            this.f9965f[i7].put("ImageWidth", cVarM11918f4);
            return;
        }
        if (cVar.f9989a == 5) {
            e[] eVarArr = (e[]) cVar.m11923k(this.f9967h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarM11918f = c.m11916d(eVarArr[0], this.f9967h);
            cVarM11918f2 = c.m11916d(eVarArr[1], this.f9967h);
        } else {
            int[] iArr = (int[]) cVar.m11923k(this.f9967h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarM11918f = c.m11918f(iArr[0], this.f9967h);
            cVarM11918f2 = c.m11918f(iArr[1], this.f9967h);
        }
        this.f9965f[i7].put("ImageWidth", cVarM11918f);
        this.f9965f[i7].put("ImageLength", cVarM11918f2);
    }

    /* JADX INFO: renamed from: N */
    private void m11882N() throws Throwable {
        m11880L(0, 5);
        m11880L(0, 4);
        m11880L(5, 4);
        c cVar = (c) this.f9965f[1].get("PixelXDimension");
        c cVar2 = (c) this.f9965f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f9965f[0].put("ImageWidth", cVar);
            this.f9965f[0].put("ImageLength", cVar2);
        }
        if (this.f9965f[4].isEmpty() && m11906z(this.f9965f[5])) {
            HashMap[] mapArr = this.f9965f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m11906z(this.f9965f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m11876H(0, "ThumbnailOrientation", "Orientation");
        m11876H(0, "ThumbnailImageLength", "ImageLength");
        m11876H(0, "ThumbnailImageWidth", "ImageWidth");
        m11876H(5, "ThumbnailOrientation", "Orientation");
        m11876H(5, "ThumbnailImageLength", "ImageLength");
        m11876H(5, "ThumbnailImageWidth", "ImageWidth");
        m11876H(4, "Orientation", "ThumbnailOrientation");
        m11876H(4, "ImageLength", "ThumbnailImageLength");
        m11876H(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: a */
    private void m11883a() {
        String strM11907b = m11907b("DateTimeOriginal");
        if (strM11907b != null && m11907b("DateTime") == null) {
            this.f9965f[0].put("DateTime", c.m11913a(strM11907b));
        }
        if (m11907b("ImageWidth") == null) {
            this.f9965f[0].put("ImageWidth", c.m11914b(0L, this.f9967h));
        }
        if (m11907b("ImageLength") == null) {
            this.f9965f[0].put("ImageLength", c.m11914b(0L, this.f9967h));
        }
        if (m11907b("Orientation") == null) {
            this.f9965f[0].put("Orientation", c.m11914b(0L, this.f9967h));
        }
        if (m11907b("LightSource") == null) {
            this.f9965f[1].put("LightSource", c.m11914b(0L, this.f9967h));
        }
    }

    /* JADX INFO: renamed from: d */
    private c m11884d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f9953u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f9941i0.length; i7++) {
            c cVar = (c) this.f9965f[i7].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private void m11885e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i7;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC2573b.b.m11933a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f9965f[0].put("ImageWidth", c.m11918f(Integer.parseInt(strExtractMetadata), this.f9967h));
                }
                if (strExtractMetadata2 != null) {
                    this.f9965f[0].put("ImageLength", c.m11918f(Integer.parseInt(strExtractMetadata2), this.f9967h));
                }
                if (strExtractMetadata3 != null) {
                    int i8 = Integer.parseInt(strExtractMetadata3);
                    if (i8 == 90) {
                        i7 = 6;
                    } else if (i8 != 180) {
                        i7 = i8 != 270 ? 1 : 8;
                    } else {
                        i7 = 3;
                    }
                    this.f9965f[0].put("Orientation", c.m11918f(i7, this.f9967h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata4);
                    int i10 = Integer.parseInt(strExtractMetadata5);
                    if (i10 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.m11926J(i9);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i11 = i9 + 6;
                    int i12 = i10 - 6;
                    if (!Arrays.equals(bArr, f9948p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    if (fVar.read(bArr2) != i12) {
                        throw new IOException("Can't read exif");
                    }
                    this.f9975p = i11;
                    m11874F(bArr2, 0);
                }
                if (f9953u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: f */
    private void m11886f(androidx.exifinterface.media.C2572a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C2572a.m11886f(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* JADX INFO: renamed from: g */
    private int m11887g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m11899s(bArr)) {
            return 4;
        }
        if (m11902v(bArr)) {
            return 9;
        }
        if (m11898r(bArr)) {
            return 12;
        }
        if (m11900t(bArr)) {
            return 7;
        }
        if (m11903w(bArr)) {
            return 10;
        }
        if (m11901u(bArr)) {
            return 13;
        }
        return m11869A(bArr) ? 14 : 0;
    }

    /* JADX INFO: renamed from: h */
    private void m11888h(f fVar) throws Throwable {
        int i7;
        int i8;
        m11891k(fVar);
        c cVar = (c) this.f9965f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f9992d);
            fVar2.m11911n(this.f9967h);
            byte[] bArr = f9911E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.m11926J(0L);
            byte[] bArr3 = f9912F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.m11926J(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.m11926J(12L);
            }
            m11875G(fVar2, 6);
            c cVar2 = (c) this.f9965f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f9965f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f9965f[5].put("JPEGInterchangeFormat", cVar2);
                this.f9965f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f9965f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.m11923k(this.f9967h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i7 = iArr[3]) <= (i8 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i7 - i8) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                c cVarM11918f = c.m11918f(i11, this.f9967h);
                c cVarM11918f2 = c.m11918f(i12, this.f9967h);
                this.f9965f[0].put("ImageWidth", cVarM11918f);
                this.f9965f[0].put("ImageLength", cVarM11918f2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m11889i(b bVar) throws Throwable {
        if (f9953u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m11911n(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f9913G;
        bVar.m11912x(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i7 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i8 = length + 8;
                if (i8 == 16 && !Arrays.equals(bArr2, f9915I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f9916J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f9914H)) {
                    byte[] bArr3 = new byte[i7];
                    if (bVar.read(bArr3) != i7) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2573b.m11927a(bArr2));
                    }
                    int i9 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i9) {
                        this.f9975p = i8;
                        m11874F(bArr3, 0);
                        m11882N();
                        m11878J(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i9 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = i7 + 4;
                bVar.m11912x(i10);
                length = i8 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m11890j(b bVar) throws Throwable {
        boolean z7 = f9953u;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m11912x(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        bVar.m11912x(i7 - bVar.m11909d());
        bVar.read(bArr4);
        m11886f(new b(bArr4), i7, 5);
        bVar.m11912x(i9 - bVar.m11909d());
        bVar.m11911n(ByteOrder.BIG_ENDIAN);
        int i10 = bVar.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f9936d0.f9993a) {
                short s7 = bVar.readShort();
                short s8 = bVar.readShort();
                c cVarM11918f = c.m11918f(s7, this.f9967h);
                c cVarM11918f2 = c.m11918f(s8, this.f9967h);
                this.f9965f[0].put("ImageLength", cVarM11918f);
                this.f9965f[0].put("ImageWidth", cVarM11918f2);
                if (f9953u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s7) + ", width: " + ((int) s8));
                    return;
                }
                return;
            }
            bVar.m11912x(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m11891k(f fVar) throws Throwable {
        c cVar;
        m11871C(fVar);
        m11875G(fVar, 0);
        m11881M(fVar, 0);
        m11881M(fVar, 5);
        m11881M(fVar, 4);
        m11882N();
        if (this.f9963d != 8 || (cVar = (c) this.f9965f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f9992d);
        fVar2.m11911n(this.f9967h);
        fVar2.m11912x(6);
        m11875G(fVar2, 9);
        c cVar2 = (c) this.f9965f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f9965f[1].put("ColorSpace", cVar2);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m11892l(f fVar) throws Throwable {
        if (f9953u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        m11891k(fVar);
        c cVar = (c) this.f9965f[0].get("JpgFromRaw");
        if (cVar != null) {
            m11886f(new b(cVar.f9992d), (int) cVar.f9991c, 5);
        }
        c cVar2 = (c) this.f9965f[0].get("ISO");
        c cVar3 = (c) this.f9965f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f9965f[1].put("PhotographicSensitivity", cVar2);
    }

    /* JADX INFO: renamed from: m */
    private void m11893m(f fVar) throws IOException {
        byte[] bArr = f9948p0;
        fVar.m11912x(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f9975p = bArr.length;
        m11874F(bArr2, 0);
    }

    /* JADX INFO: renamed from: n */
    private void m11894n(b bVar) throws Throwable {
        if (f9953u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m11911n(ByteOrder.LITTLE_ENDIAN);
        bVar.m11912x(f9917K.length);
        int i7 = bVar.readInt() + 8;
        byte[] bArr = f9918L;
        bVar.m11912x(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i8 = bVar.readInt();
                int i9 = length + 8;
                if (Arrays.equals(f9919M, bArr2)) {
                    byte[] bArr3 = new byte[i8];
                    if (bVar.read(bArr3) == i8) {
                        this.f9975p = i9;
                        m11874F(bArr3, 0);
                        m11878J(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2573b.m11927a(bArr2));
                    }
                }
                if (i8 % 2 == 1) {
                    i8++;
                }
                length = i9 + i8;
                if (length == i7) {
                    return;
                }
                if (length > i7) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.m11912x(i8);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m11895o(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iM11921i = cVar.m11921i(this.f9967h);
        int iM11921i2 = cVar2.m11921i(this.f9967h);
        if (this.f9963d == 7) {
            iM11921i += this.f9976q;
        }
        if (iM11921i > 0 && iM11921i2 > 0) {
            this.f9968i = true;
            if (this.f9960a == null && this.f9962c == null && this.f9961b == null) {
                byte[] bArr = new byte[iM11921i2];
                bVar.skip(iM11921i);
                bVar.read(bArr);
                this.f9973n = bArr;
            }
            this.f9971l = iM11921i;
            this.f9972m = iM11921i2;
        }
        if (f9953u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM11921i + ", length: " + iM11921i2);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m11896p(b bVar, HashMap map) {
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrM11928b = AbstractC2573b.m11928b(cVar.m11923k(this.f9967h));
        long[] jArrM11928b2 = AbstractC2573b.m11928b(cVar2.m11923k(this.f9967h));
        if (jArrM11928b == null || jArrM11928b.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrM11928b2 == null || jArrM11928b2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrM11928b.length != jArrM11928b2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j7 = 0;
        for (long j8 : jArrM11928b2) {
            j7 += j8;
        }
        int i7 = (int) j7;
        byte[] bArr = new byte[i7];
        this.f9970k = true;
        this.f9969j = true;
        this.f9968i = true;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < jArrM11928b.length; i10++) {
            int i11 = (int) jArrM11928b[i10];
            int i12 = (int) jArrM11928b2[i10];
            if (i10 < jArrM11928b.length - 1 && i11 + i12 != jArrM11928b[i10 + 1]) {
                this.f9970k = false;
            }
            int i13 = i11 - i8;
            if (i13 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j9 = i13;
            if (bVar.skip(j9) != j9) {
                Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                return;
            }
            int i14 = i8 + i13;
            byte[] bArr2 = new byte[i12];
            if (bVar.read(bArr2) != i12) {
                Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                return;
            }
            i8 = i14 + i12;
            System.arraycopy(bArr2, 0, bArr, i9, i12);
            i9 += i12;
        }
        this.f9973n = bArr;
        if (this.f9970k) {
            this.f9971l = (int) jArrM11928b[0];
            this.f9972m = i7;
        }
    }

    /* JADX INFO: renamed from: q */
    private static boolean m11897q(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f9948p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr3 = f9948p0;
            if (i7 >= bArr3.length) {
                return true;
            }
            if (bArr2[i7] != bArr3[i7]) {
                return false;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m11898r(byte[] bArr) throws Throwable {
        long j7;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, f9908B)) {
                        bVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j7 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j7 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j8 = length - j7;
                    if (j8 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z7 = false;
                    boolean z8 = false;
                    for (long j9 = 0; j9 < j8 / 4; j9++) {
                        if (bVar2.read(bArr3) != 4) {
                            bVar2.close();
                            return false;
                        }
                        if (j9 != 1) {
                            if (Arrays.equals(bArr3, f9909C)) {
                                z7 = true;
                            } else if (Arrays.equals(bArr3, f9910D)) {
                                z8 = true;
                            }
                            if (z7 && z8) {
                                bVar2.close();
                                return true;
                            }
                        }
                    }
                    bVar2.close();
                } catch (Exception e7) {
                    e = e7;
                    bVar = bVar2;
                    if (f9953u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: s */
    private static boolean m11899s(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f9907A;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m11900t(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM11873E = m11873E(bVar2);
                this.f9967h = byteOrderM11873E;
                bVar2.m11911n(byteOrderM11873E);
                short s7 = bVar2.readShort();
                boolean z7 = s7 == 20306 || s7 == 21330;
                bVar2.close();
                return z7;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m11901u(byte[] bArr) {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f9913G;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: v */
    private boolean m11902v(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i7 = 0; i7 < bytes.length; i7++) {
            if (bArr[i7] != bytes[i7]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    private boolean m11903w(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM11873E = m11873E(bVar2);
                this.f9967h = byteOrderM11873E;
                bVar2.m11911n(byteOrderM11873E);
                boolean z7 = bVar2.readShort() == 85;
                bVar2.close();
                return z7;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: x */
    private static boolean m11904x(FileDescriptor fileDescriptor) {
        try {
            AbstractC2573b.a.m11932c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f9953u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m11905y(HashMap map) {
        c cVar;
        int iM11921i;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.m11923k(this.f9967h);
            int[] iArr2 = f9957x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f9963d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iM11921i = cVar.m11921i(this.f9967h)) == 1 && Arrays.equals(iArr, f9959z)) || (iM11921i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f9953u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* JADX INFO: renamed from: z */
    private boolean m11906z(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.m11921i(this.f9967h) <= 512 && cVar2.m11921i(this.f9967h) <= 512;
    }

    /* JADX INFO: renamed from: b */
    public String m11907b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarM11884d = m11884d(str);
        if (cVarM11884d != null) {
            if (!f9945m0.contains(str)) {
                return cVarM11884d.m11922j(this.f9967h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = cVarM11884d.f9989a;
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarM11884d.f9989a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarM11884d.m11923k(this.f9967h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f9997a / eVar.f9998b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f9997a / eVar2.f9998b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f9997a / eVar3.f9998b)));
            }
            try {
                return Double.toString(cVarM11884d.m11920h(this.f9967h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public int m11908c(String str, int i7) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarM11884d = m11884d(str);
        if (cVarM11884d != null) {
            try {
                return cVarM11884d.m11921i(this.f9967h);
            } catch (NumberFormatException unused) {
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$f */
    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f9985a.mark(C3553a.e.API_PRIORITY_OTHER);
        }

        /* JADX INFO: renamed from: J */
        public void m11926J(long j7) throws IOException {
            int i7 = this.f9987c;
            if (i7 > j7) {
                this.f9987c = 0;
                this.f9985a.reset();
            } else {
                j7 -= (long) i7;
            }
            m11912x((int) j7);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f9985a.mark(C3553a.e.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public C2572a(InputStream inputStream, int i7) {
        d[][] dVarArr = f9941i0;
        this.f9965f = new HashMap[dVarArr.length];
        this.f9966g = new HashSet(dVarArr.length);
        this.f9967h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f9960a = null;
        if (i7 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f9948p0.length);
            if (!m11897q(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f9964e = true;
            this.f9962c = null;
            this.f9961b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f9962c = (AssetManager.AssetInputStream) inputStream;
            this.f9961b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (m11904x(fileInputStream.getFD())) {
                this.f9962c = null;
                this.f9961b = fileInputStream.getFD();
            } else {
                this.f9962c = null;
                this.f9961b = null;
            }
        } else {
            this.f9962c = null;
            this.f9961b = null;
        }
        m11870B(inputStream);
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$d */
    static class d {

        /* JADX INFO: renamed from: a */
        public final int f9993a;

        /* JADX INFO: renamed from: b */
        public final String f9994b;

        /* JADX INFO: renamed from: c */
        public final int f9995c;

        /* JADX INFO: renamed from: d */
        public final int f9996d;

        d(String str, int i7, int i8) {
            this.f9994b = str;
            this.f9993a = i7;
            this.f9995c = i8;
            this.f9996d = -1;
        }

        /* JADX INFO: renamed from: a */
        boolean m11924a(int i7) {
            int i8;
            int i9 = this.f9995c;
            if (i9 == 7 || i7 == 7 || i9 == i7 || (i8 = this.f9996d) == i7) {
                return true;
            }
            if ((i9 == 4 || i8 == 4) && i7 == 3) {
                return true;
            }
            if ((i9 == 9 || i8 == 9) && i7 == 8) {
                return true;
            }
            return (i9 == 12 || i8 == 12) && i7 == 11;
        }

        d(String str, int i7, int i8, int i9) {
            this.f9994b = str;
            this.f9993a = i7;
            this.f9995c = i8;
            this.f9996d = i9;
        }
    }
}
