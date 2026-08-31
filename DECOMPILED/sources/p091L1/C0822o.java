package p091L1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p043F1.InterfaceC0404b;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: L1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0822o implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    static final byte[] f3258a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    static final byte[] f3259b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    private static final int[] f3260c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: L1.o$a */
    private static final class a implements c {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f3261a;

        a(ByteBuffer byteBuffer) {
            this.f3261a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: a */
        public int mo3833a() {
            return (mo3835c() << 8) | mo3835c();
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: b */
        public int mo3834b(byte[] bArr, int i7) {
            int iMin = Math.min(i7, this.f3261a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f3261a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: c */
        public short mo3835c() throws c.a {
            if (this.f3261a.remaining() >= 1) {
                return (short) (this.f3261a.get() & 255);
            }
            throw new c.a();
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: l */
        public long mo3836l(long j7) {
            int iMin = (int) Math.min(this.f3261a.remaining(), j7);
            ByteBuffer byteBuffer = this.f3261a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: L1.o$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f3262a;

        b(byte[] bArr, int i7) {
            this.f3262a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i7);
        }

        /* JADX INFO: renamed from: c */
        private boolean m3837c(int i7, int i8) {
            return this.f3262a.remaining() - i7 >= i8;
        }

        /* JADX INFO: renamed from: a */
        short m3838a(int i7) {
            if (m3837c(i7, 2)) {
                return this.f3262a.getShort(i7);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        int m3839b(int i7) {
            if (m3837c(i7, 4)) {
                return this.f3262a.getInt(i7);
            }
            return -1;
        }

        /* JADX INFO: renamed from: d */
        int m3840d() {
            return this.f3262a.remaining();
        }

        /* JADX INFO: renamed from: e */
        void m3841e(ByteOrder byteOrder) {
            this.f3262a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: L1.o$c */
    private interface c {

        /* JADX INFO: renamed from: L1.o$c$a */
        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo3833a();

        /* JADX INFO: renamed from: b */
        int mo3834b(byte[] bArr, int i7);

        /* JADX INFO: renamed from: c */
        short mo3835c();

        /* JADX INFO: renamed from: l */
        long mo3836l(long j7);
    }

    /* JADX INFO: renamed from: L1.o$d */
    private static final class d implements c {

        /* JADX INFO: renamed from: a */
        private final InputStream f3263a;

        d(InputStream inputStream) {
            this.f3263a = inputStream;
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: a */
        public int mo3833a() {
            return (mo3835c() << 8) | mo3835c();
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: b */
        public int mo3834b(byte[] bArr, int i7) throws c.a {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7 && (i9 = this.f3263a.read(bArr, i8, i7 - i8)) != -1) {
                i8 += i9;
            }
            if (i8 == 0 && i9 == -1) {
                throw new c.a();
            }
            return i8;
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: c */
        public short mo3835c() throws IOException {
            int i7 = this.f3263a.read();
            if (i7 != -1) {
                return (short) i7;
            }
            throw new c.a();
        }

        @Override // p091L1.C0822o.c
        /* JADX INFO: renamed from: l */
        public long mo3836l(long j7) throws IOException {
            if (j7 < 0) {
                return 0L;
            }
            long j8 = j7;
            while (j8 > 0) {
                long jSkip = this.f3263a.skip(j8);
                if (jSkip <= 0) {
                    if (this.f3263a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j8 -= jSkip;
            }
            return j7 - j8;
        }
    }

    /* JADX INFO: renamed from: g */
    private static int m3813g(int i7, int i8) {
        return i7 + 2 + (i8 * 12);
    }

    /* JADX INFO: renamed from: h */
    private int m3814h(c cVar, InterfaceC0404b interfaceC0404b) {
        try {
            int iMo3833a = cVar.mo3833a();
            if (!m3816j(iMo3833a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo3833a);
                }
                return -1;
            }
            int iM3822p = m3822p(cVar);
            if (iM3822p == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC0404b.mo1739e(iM3822p, byte[].class);
            try {
                return m3825s(cVar, bArr, iM3822p);
            } finally {
                interfaceC0404b.mo1738d(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    private ImageHeaderParser.ImageType m3815i(c cVar) {
        try {
            int iMo3833a = cVar.mo3833a();
            if (iMo3833a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo3835c = (iMo3833a << 8) | cVar.mo3835c();
            if (iMo3835c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo3835c2 = (iMo3835c << 8) | cVar.mo3835c();
            if (iMo3835c2 == -1991225785) {
                cVar.mo3836l(21L);
                try {
                    return cVar.mo3835c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo3835c2 != 1380533830) {
                return m3826t(cVar, iMo3835c2);
            }
            cVar.mo3836l(4L);
            if (((cVar.mo3833a() << 16) | cVar.mo3833a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo3833a2 = (cVar.mo3833a() << 16) | cVar.mo3833a();
            if ((iMo3833a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i7 = iMo3833a2 & 255;
            if (i7 != 88) {
                if (i7 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                cVar.mo3836l(4L);
                return (cVar.mo3835c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            cVar.mo3836l(4L);
            short sMo3835c = cVar.mo3835c();
            if ((sMo3835c & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (sMo3835c & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m3816j(int i7) {
        return (i7 & 65496) == 65496 || i7 == 19789 || i7 == 18761;
    }

    /* JADX INFO: renamed from: k */
    private boolean m3817k(byte[] bArr, int i7) {
        return m3820n(bArr, i7, f3258a);
    }

    /* JADX INFO: renamed from: l */
    private boolean m3818l(c cVar, InterfaceC0404b interfaceC0404b) {
        if (m3815i(cVar) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int iM3821o = m3821o(cVar);
        while (iM3821o > 0) {
            byte[] bArr = (byte[]) interfaceC0404b.mo1739e(iM3821o, byte[].class);
            try {
                if (m3819m(cVar, bArr, iM3821o)) {
                    return true;
                }
                interfaceC0404b.mo1738d(bArr);
                iM3821o = m3821o(cVar);
            } finally {
                interfaceC0404b.mo1738d(bArr);
            }
        }
        if (Log.isLoggable("DfltImageHeaderParser", 2)) {
            Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private boolean m3819m(c cVar, byte[] bArr, int i7) {
        int iMo3834b = cVar.mo3834b(bArr, i7);
        if (iMo3834b == i7) {
            return m3820n(bArr, i7, f3259b);
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
            return false;
        }
        Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + i7 + ", actually read: " + iMo3834b);
        return false;
    }

    /* JADX INFO: renamed from: n */
    private boolean m3820n(byte[] bArr, int i7, byte[] bArr2) {
        boolean z7 = (bArr == null || bArr2 == null || i7 <= bArr2.length) ? false : true;
        if (z7) {
            for (int i8 = 0; i8 < bArr2.length; i8++) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: o */
    private int m3821o(c cVar) {
        return m3823q(cVar, 226);
    }

    /* JADX INFO: renamed from: p */
    private int m3822p(c cVar) {
        return m3823q(cVar, 225);
    }

    /* JADX INFO: renamed from: q */
    private int m3823q(c cVar, int i7) {
        short sMo3835c;
        int iMo3833a;
        long j7;
        long jMo3836l;
        do {
            short sMo3835c2 = cVar.mo3835c();
            if (sMo3835c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo3835c2));
                }
                return -1;
            }
            sMo3835c = cVar.mo3835c();
            if (sMo3835c == 218) {
                return -1;
            }
            if (sMo3835c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i7 + " segment");
                }
                return -1;
            }
            iMo3833a = cVar.mo3833a() - 2;
            if (sMo3835c == i7) {
                return iMo3833a;
            }
            j7 = iMo3833a;
            jMo3836l = cVar.mo3836l(j7);
        } while (jMo3836l == j7);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo3835c) + ", wanted to skip: " + iMo3833a + ", but actually skipped: " + jMo3836l);
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    private static int m3824r(b bVar) {
        ByteOrder byteOrder;
        short sM3838a = bVar.m3838a(6);
        if (sM3838a != 18761) {
            if (sM3838a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM3838a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.m3841e(byteOrder);
        int iM3839b = bVar.m3839b(10) + 6;
        short sM3838a2 = bVar.m3838a(iM3839b);
        for (int i7 = 0; i7 < sM3838a2; i7++) {
            int iM3813g = m3813g(iM3839b, i7);
            short sM3838a3 = bVar.m3838a(iM3813g);
            if (sM3838a3 == 274) {
                short sM3838a4 = bVar.m3838a(iM3813g + 2);
                if (sM3838a4 >= 1 && sM3838a4 <= 12) {
                    int iM3839b2 = bVar.m3839b(iM3813g + 4);
                    if (iM3839b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i7 + " tagType=" + ((int) sM3838a3) + " formatCode=" + ((int) sM3838a4) + " componentCount=" + iM3839b2);
                        }
                        int i8 = iM3839b2 + f3260c[sM3838a4];
                        if (i8 <= 4) {
                            int i9 = iM3813g + 8;
                            if (i9 >= 0 && i9 <= bVar.m3840d()) {
                                if (i8 >= 0 && i8 + i9 <= bVar.m3840d()) {
                                    return bVar.m3838a(i9);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sM3838a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i9 + " tagType=" + ((int) sM3838a3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM3838a4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sM3838a4));
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    private int m3825s(c cVar, byte[] bArr, int i7) {
        int iMo3834b = cVar.mo3834b(bArr, i7);
        if (iMo3834b == i7) {
            if (m3817k(bArr, i7)) {
                return m3824r(new b(bArr, i7));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i7 + ", actually read: " + iMo3834b);
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    private ImageHeaderParser.ImageType m3826t(c cVar, int i7) {
        if (((cVar.mo3833a() << 16) | cVar.mo3833a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo3833a = (cVar.mo3833a() << 16) | cVar.mo3833a();
        if (iMo3833a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i8 = 0;
        boolean z7 = iMo3833a == 1635150182;
        cVar.mo3836l(4L);
        int i9 = i7 - 16;
        if (i9 % 4 == 0) {
            while (i8 < 5 && i9 > 0) {
                int iMo3833a2 = (cVar.mo3833a() << 16) | cVar.mo3833a();
                if (iMo3833a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iMo3833a2 == 1635150182) {
                    z7 = true;
                }
                i8++;
                i9 -= 4;
            }
        }
        return z7 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo3827a(ByteBuffer byteBuffer) {
        return m3815i(new a((ByteBuffer) AbstractC2022k.m8408e(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public int mo3828b(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
        return m3814h(new a((ByteBuffer) AbstractC2022k.m8408e(byteBuffer)), (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public boolean mo3829c(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
        return m3818l(new a((ByteBuffer) AbstractC2022k.m8408e(byteBuffer)), (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: d */
    public ImageHeaderParser.ImageType mo3830d(InputStream inputStream) {
        return m3815i(new d((InputStream) AbstractC2022k.m8408e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: e */
    public int mo3831e(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        return m3814h(new d((InputStream) AbstractC2022k.m8408e(inputStream)), (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: f */
    public boolean mo3832f(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        return m3818l(new d((InputStream) AbstractC2022k.m8408e(inputStream)), (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b));
    }
}
