package p011B1;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: B1.e */
/* JADX INFO: loaded from: classes.dex */
public class C0059e implements InterfaceC0055a {

    /* JADX INFO: renamed from: u */
    private static final String f415u = "e";

    /* JADX INFO: renamed from: a */
    private int[] f416a;

    /* JADX INFO: renamed from: b */
    private final int[] f417b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0055a.a f418c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f419d;

    /* JADX INFO: renamed from: e */
    private byte[] f420e;

    /* JADX INFO: renamed from: f */
    private short[] f421f;

    /* JADX INFO: renamed from: g */
    private byte[] f422g;

    /* JADX INFO: renamed from: h */
    private byte[] f423h;

    /* JADX INFO: renamed from: i */
    private byte[] f424i;

    /* JADX INFO: renamed from: j */
    private int[] f425j;

    /* JADX INFO: renamed from: k */
    private int f426k;

    /* JADX INFO: renamed from: l */
    private C0057c f427l;

    /* JADX INFO: renamed from: m */
    private Bitmap f428m;

    /* JADX INFO: renamed from: n */
    private boolean f429n;

    /* JADX INFO: renamed from: o */
    private int f430o;

    /* JADX INFO: renamed from: p */
    private int f431p;

    /* JADX INFO: renamed from: q */
    private int f432q;

    /* JADX INFO: renamed from: r */
    private int f433r;

    /* JADX INFO: renamed from: s */
    private Boolean f434s;

    /* JADX INFO: renamed from: t */
    private Bitmap.Config f435t;

    public C0059e(InterfaceC0055a.a aVar, C0057c c0057c, ByteBuffer byteBuffer, int i7) {
        this(aVar);
        m252q(c0057c, byteBuffer, i7);
    }

    /* JADX INFO: renamed from: i */
    private int m243i(int i7, int i8, int i9) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i7; i15 < this.f431p + i7; i15++) {
            byte[] bArr = this.f424i;
            if (i15 >= bArr.length || i15 >= i8) {
                break;
            }
            int i16 = this.f416a[bArr[i15] & 255];
            if (i16 != 0) {
                i10 += (i16 >> 24) & 255;
                i11 += (i16 >> 16) & 255;
                i12 += (i16 >> 8) & 255;
                i13 += i16 & 255;
                i14++;
            }
        }
        int i17 = i7 + i9;
        for (int i18 = i17; i18 < this.f431p + i17; i18++) {
            byte[] bArr2 = this.f424i;
            if (i18 >= bArr2.length || i18 >= i8) {
                break;
            }
            int i19 = this.f416a[bArr2[i18] & 255];
            if (i19 != 0) {
                i10 += (i19 >> 24) & 255;
                i11 += (i19 >> 16) & 255;
                i12 += (i19 >> 8) & 255;
                i13 += i19 & 255;
                i14++;
            }
        }
        if (i14 == 0) {
            return 0;
        }
        return ((i10 / i14) << 24) | ((i11 / i14) << 16) | ((i12 / i14) << 8) | (i13 / i14);
    }

    /* JADX INFO: renamed from: j */
    private void m244j(C0056b c0056b) {
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.f425j;
        int i11 = c0056b.f390d;
        int i12 = this.f431p;
        int i13 = i11 / i12;
        int i14 = c0056b.f388b / i12;
        int i15 = c0056b.f389c / i12;
        int i16 = c0056b.f387a / i12;
        boolean z7 = this.f426k == 0;
        int i17 = this.f433r;
        int i18 = this.f432q;
        byte[] bArr = this.f424i;
        int[] iArr2 = this.f416a;
        Boolean bool = this.f434s;
        int i19 = 8;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1;
        while (i21 < i13) {
            int[] iArr3 = iArr;
            if (c0056b.f391e) {
                if (i20 >= i13) {
                    int i23 = i22 + 1;
                    i7 = i13;
                    if (i23 == 2) {
                        i22 = i23;
                        i20 = 4;
                    } else if (i23 == 3) {
                        i22 = i23;
                        i19 = 4;
                        i20 = 2;
                    } else if (i23 != 4) {
                        i22 = i23;
                    } else {
                        i22 = i23;
                        i20 = 1;
                        i19 = 2;
                    }
                } else {
                    i7 = i13;
                }
                i8 = i20 + i19;
            } else {
                i7 = i13;
                i8 = i20;
                i20 = i21;
            }
            int i24 = i20 + i14;
            boolean z8 = i12 == 1;
            if (i24 < i18) {
                int i25 = i24 * i17;
                int i26 = i25 + i16;
                int i27 = i26 + i15;
                int i28 = i25 + i17;
                if (i28 < i27) {
                    i27 = i28;
                }
                i9 = i8;
                int i29 = i21 * i12 * c0056b.f389c;
                if (z8) {
                    int i30 = i26;
                    while (i30 < i27) {
                        int i31 = i30;
                        int i32 = iArr2[bArr[i29] & 255];
                        if (i32 != 0) {
                            iArr3[i31] = i32;
                        } else if (z7 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i29 += i12;
                        i30 = i31 + 1;
                    }
                } else {
                    int i33 = ((i27 - i26) * i12) + i29;
                    i10 = i12;
                    int i34 = i26;
                    while (i34 < i27) {
                        int i35 = i27;
                        int iM243i = m243i(i29, i33, c0056b.f389c);
                        if (iM243i != 0) {
                            iArr3[i34] = iM243i;
                        } else if (z7 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i29 += i10;
                        i34++;
                        i27 = i35;
                    }
                }
                i21++;
                i12 = i10;
                iArr = iArr3;
                i13 = i7;
                i20 = i9;
            } else {
                i9 = i8;
            }
            i10 = i12;
            i21++;
            i12 = i10;
            iArr = iArr3;
            i13 = i7;
            i20 = i9;
        }
        if (this.f434s == null) {
            this.f434s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: k */
    private void m245k(C0056b c0056b) {
        C0056b c0056b2 = c0056b;
        int[] iArr = this.f425j;
        int i7 = c0056b2.f390d;
        int i8 = c0056b2.f388b;
        int i9 = c0056b2.f389c;
        int i10 = c0056b2.f387a;
        boolean z7 = this.f426k == 0;
        int i11 = this.f433r;
        byte[] bArr = this.f424i;
        int[] iArr2 = this.f416a;
        int i12 = 0;
        byte b7 = -1;
        while (i12 < i7) {
            int i13 = (i12 + i8) * i11;
            int i14 = i13 + i10;
            int i15 = i14 + i9;
            int i16 = i13 + i11;
            if (i16 < i15) {
                i15 = i16;
            }
            int i17 = c0056b2.f389c * i12;
            int i18 = i14;
            while (i18 < i15) {
                byte b8 = bArr[i17];
                int[] iArr3 = iArr;
                int i19 = b8 & 255;
                if (i19 != b7) {
                    int i20 = iArr2[i19];
                    if (i20 != 0) {
                        iArr3[i18] = i20;
                    } else {
                        b7 = b8;
                    }
                }
                i17++;
                i18++;
                iArr = iArr3;
            }
            i12++;
            c0056b2 = c0056b;
        }
        Boolean bool = this.f434s;
        this.f434s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f434s == null && z7 && b7 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: l */
    private void m246l(C0056b c0056b) {
        int i7;
        int i8;
        short s7;
        C0059e c0059e = this;
        if (c0056b != null) {
            c0059e.f419d.position(c0056b.f396j);
        }
        if (c0056b == null) {
            C0057c c0057c = c0059e.f427l;
            i7 = c0057c.f403f;
            i8 = c0057c.f404g;
        } else {
            i7 = c0056b.f389c;
            i8 = c0056b.f390d;
        }
        int i9 = i7 * i8;
        byte[] bArr = c0059e.f424i;
        if (bArr == null || bArr.length < i9) {
            c0059e.f424i = c0059e.f418c.mo219e(i9);
        }
        byte[] bArr2 = c0059e.f424i;
        if (c0059e.f421f == null) {
            c0059e.f421f = new short[4096];
        }
        short[] sArr = c0059e.f421f;
        if (c0059e.f422g == null) {
            c0059e.f422g = new byte[4096];
        }
        byte[] bArr3 = c0059e.f422g;
        if (c0059e.f423h == null) {
            c0059e.f423h = new byte[4097];
        }
        byte[] bArr4 = c0059e.f423h;
        int iM249p = c0059e.m249p();
        int i10 = 1 << iM249p;
        int i11 = i10 + 1;
        int i12 = i10 + 2;
        int i13 = iM249p + 1;
        int i14 = (1 << i13) - 1;
        byte b7 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            sArr[i15] = 0;
            bArr3[i15] = (byte) i15;
        }
        byte[] bArr5 = c0059e.f420e;
        int i16 = i13;
        int i17 = i12;
        int i18 = i14;
        int i19 = 0;
        int iM248o = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        while (i19 < i9) {
            if (iM248o == 0) {
                iM248o = c0059e.m248o();
                if (iM248o <= 0) {
                    c0059e.f430o = 3;
                    break;
                }
                i20 = b7;
            }
            i22 += (bArr5[i20] & 255) << i21;
            i20++;
            iM248o--;
            int i27 = i21 + 8;
            i17 = i17;
            int i28 = i16;
            int i29 = i26;
            short[] sArr2 = sArr;
            int i30 = i24;
            while (true) {
                bArr3 = bArr3;
                if (i27 < i28) {
                    i24 = i30;
                    break;
                }
                int i31 = i22 & i18;
                i22 >>= i28;
                i27 -= i28;
                if (i31 == i10) {
                    i28 = i13;
                    i17 = i12;
                    i18 = i14;
                    i29 = -1;
                } else {
                    if (i31 == i11) {
                        i24 = i30;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i29 == -1) {
                        bArr2[i23] = bArr3[i31];
                        i23++;
                        i19++;
                        i29 = i31;
                        i30 = i29;
                        bArr4 = bArr6;
                    } else {
                        if (i31 >= i17) {
                            bArr6[i25] = (byte) i30;
                            i25++;
                            s7 = i29;
                        } else {
                            s7 = i31;
                        }
                        while (s7 >= i10) {
                            bArr6[i25] = bArr3[s7];
                            i25++;
                            s7 = sArr2[s7];
                        }
                        int i32 = bArr3[s7] & 255;
                        byte b8 = (byte) i32;
                        bArr2[i23] = b8;
                        while (true) {
                            i23++;
                            i19++;
                            if (i25 <= 0) {
                                break;
                            }
                            i25--;
                            bArr2[i23] = bArr6[i25];
                        }
                        if (i17 < 4096) {
                            sArr2[i17] = (short) i29;
                            bArr3[i17] = b8;
                            i17++;
                            if ((i17 & i18) == 0 && i17 < 4096) {
                                i28++;
                                i18 += i17;
                            }
                        }
                        i29 = i31;
                        bArr4 = bArr6;
                        i30 = i32;
                    }
                }
            }
            i21 = i27;
            sArr = sArr2;
            bArr3 = bArr3;
            b7 = 0;
            i26 = i29;
            i16 = i28;
            c0059e = this;
        }
        Arrays.fill(bArr2, i23, i9, b7);
    }

    /* JADX INFO: renamed from: n */
    private Bitmap m247n() {
        Boolean bool = this.f434s;
        Bitmap bitmapMo215a = this.f418c.mo215a(this.f433r, this.f432q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f435t);
        bitmapMo215a.setHasAlpha(true);
        return bitmapMo215a;
    }

    /* JADX INFO: renamed from: o */
    private int m248o() {
        int iM249p = m249p();
        if (iM249p <= 0) {
            return iM249p;
        }
        ByteBuffer byteBuffer = this.f419d;
        byteBuffer.get(this.f420e, 0, Math.min(iM249p, byteBuffer.remaining()));
        return iM249p;
    }

    /* JADX INFO: renamed from: p */
    private int m249p() {
        return this.f419d.get() & 255;
    }

    /* JADX INFO: renamed from: r */
    private Bitmap m250r(C0056b c0056b, C0056b c0056b2) {
        int i7;
        int i8;
        Bitmap bitmap;
        int[] iArr = this.f425j;
        int i9 = 0;
        if (c0056b2 == null) {
            Bitmap bitmap2 = this.f428m;
            if (bitmap2 != null) {
                this.f418c.mo217c(bitmap2);
            }
            this.f428m = null;
            Arrays.fill(iArr, 0);
        }
        if (c0056b2 != null && c0056b2.f393g == 3 && this.f428m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c0056b2 != null && (i8 = c0056b2.f393g) > 0) {
            if (i8 == 2) {
                if (!c0056b.f392f) {
                    C0057c c0057c = this.f427l;
                    int i10 = c0057c.f409l;
                    if (c0056b.f397k == null || c0057c.f407j != c0056b.f394h) {
                        i9 = i10;
                    }
                }
                int i11 = c0056b2.f390d;
                int i12 = this.f431p;
                int i13 = i11 / i12;
                int i14 = c0056b2.f388b / i12;
                int i15 = c0056b2.f389c / i12;
                int i16 = c0056b2.f387a / i12;
                int i17 = this.f433r;
                int i18 = (i14 * i17) + i16;
                int i19 = (i13 * i17) + i18;
                while (i18 < i19) {
                    int i20 = i18 + i15;
                    for (int i21 = i18; i21 < i20; i21++) {
                        iArr[i21] = i9;
                    }
                    i18 += this.f433r;
                }
            } else if (i8 == 3 && (bitmap = this.f428m) != null) {
                int i22 = this.f433r;
                bitmap.getPixels(iArr, 0, i22, 0, 0, i22, this.f432q);
            }
        }
        m246l(c0056b);
        if (c0056b.f391e || this.f431p != 1) {
            m244j(c0056b);
        } else {
            m245k(c0056b);
        }
        if (this.f429n && ((i7 = c0056b.f393g) == 0 || i7 == 1)) {
            if (this.f428m == null) {
                this.f428m = m247n();
            }
            Bitmap bitmap3 = this.f428m;
            int i23 = this.f433r;
            bitmap3.setPixels(iArr, 0, i23, 0, 0, i23, this.f432q);
        }
        Bitmap bitmapM247n = m247n();
        int i24 = this.f433r;
        bitmapM247n.setPixels(iArr, 0, i24, 0, 0, i24, this.f432q);
        return bitmapM247n;
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: a */
    public int mo207a() {
        return this.f419d.limit() + this.f424i.length + (this.f425j.length * 4);
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: b */
    public synchronized Bitmap mo208b() {
        try {
            if (this.f427l.f400c <= 0 || this.f426k < 0) {
                String str = f415u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f427l.f400c + ", framePointer=" + this.f426k);
                }
                this.f430o = 1;
            }
            int i7 = this.f430o;
            if (i7 != 1 && i7 != 2) {
                this.f430o = 0;
                if (this.f420e == null) {
                    this.f420e = this.f418c.mo219e(255);
                }
                C0056b c0056b = (C0056b) this.f427l.f402e.get(this.f426k);
                int i8 = this.f426k - 1;
                C0056b c0056b2 = i8 >= 0 ? (C0056b) this.f427l.f402e.get(i8) : null;
                int[] iArr = c0056b.f397k;
                if (iArr == null) {
                    iArr = this.f427l.f398a;
                }
                this.f416a = iArr;
                if (iArr == null) {
                    String str2 = f415u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f426k);
                    }
                    this.f430o = 1;
                    return null;
                }
                if (c0056b.f392f) {
                    System.arraycopy(iArr, 0, this.f417b, 0, iArr.length);
                    int[] iArr2 = this.f417b;
                    this.f416a = iArr2;
                    iArr2[c0056b.f394h] = 0;
                    if (c0056b.f393g == 2 && this.f426k == 0) {
                        this.f434s = Boolean.TRUE;
                    }
                }
                return m250r(c0056b, c0056b2);
            }
            String str3 = f415u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f430o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: c */
    public void mo209c() {
        this.f426k = (this.f426k + 1) % this.f427l.f400c;
    }

    @Override // p011B1.InterfaceC0055a
    public void clear() {
        this.f427l = null;
        byte[] bArr = this.f424i;
        if (bArr != null) {
            this.f418c.mo218d(bArr);
        }
        int[] iArr = this.f425j;
        if (iArr != null) {
            this.f418c.mo220f(iArr);
        }
        Bitmap bitmap = this.f428m;
        if (bitmap != null) {
            this.f418c.mo217c(bitmap);
        }
        this.f428m = null;
        this.f419d = null;
        this.f434s = null;
        byte[] bArr2 = this.f420e;
        if (bArr2 != null) {
            this.f418c.mo218d(bArr2);
        }
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: d */
    public int mo210d() {
        return this.f427l.f400c;
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: e */
    public int mo211e() {
        int i7;
        if (this.f427l.f400c <= 0 || (i7 = this.f426k) < 0) {
            return 0;
        }
        return m251m(i7);
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: f */
    public void mo212f(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f435t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: g */
    public void mo213g() {
        this.f426k = -1;
    }

    @Override // p011B1.InterfaceC0055a
    public ByteBuffer getData() {
        return this.f419d;
    }

    @Override // p011B1.InterfaceC0055a
    /* JADX INFO: renamed from: h */
    public int mo214h() {
        return this.f426k;
    }

    /* JADX INFO: renamed from: m */
    public int m251m(int i7) {
        if (i7 < 0) {
            return -1;
        }
        C0057c c0057c = this.f427l;
        if (i7 < c0057c.f400c) {
            return ((C0056b) c0057c.f402e.get(i7)).f395i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m252q(C0057c c0057c, ByteBuffer byteBuffer, int i7) {
        try {
            if (i7 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i7);
            }
            int iHighestOneBit = Integer.highestOneBit(i7);
            this.f430o = 0;
            this.f427l = c0057c;
            this.f426k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f419d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f419d.order(ByteOrder.LITTLE_ENDIAN);
            this.f429n = false;
            Iterator it = c0057c.f402e.iterator();
            while (it.hasNext()) {
                if (((C0056b) it.next()).f393g == 3) {
                    this.f429n = true;
                    break;
                }
            }
            this.f431p = iHighestOneBit;
            int i8 = c0057c.f403f;
            this.f433r = i8 / iHighestOneBit;
            int i9 = c0057c.f404g;
            this.f432q = i9 / iHighestOneBit;
            this.f424i = this.f418c.mo219e(i8 * i9);
            this.f425j = this.f418c.mo216b(this.f433r * this.f432q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0059e(InterfaceC0055a.a aVar) {
        this.f417b = new int[256];
        this.f435t = Bitmap.Config.ARGB_8888;
        this.f418c = aVar;
        this.f427l = new C0057c();
    }
}
