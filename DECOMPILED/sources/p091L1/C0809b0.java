package p091L1;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0406d;

/* JADX INFO: renamed from: L1.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C0809b0 implements InterfaceC0134j {

    /* JADX INFO: renamed from: d */
    public static final C0131g f3236d = C0131g.m591a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e */
    public static final C0131g f3237e = C0131g.m591a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f */
    private static final f f3238f = new f();

    /* JADX INFO: renamed from: g */
    private static final List f3239g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a */
    private final e f3240a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0406d f3241b;

    /* JADX INFO: renamed from: c */
    private final f f3242c;

    /* JADX INFO: renamed from: L1.b0$a */
    class a implements C0131g.b {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f3243a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // p019C1.C0131g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo598a(byte[] bArr, Long l7, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f3243a) {
                this.f3243a.position(0);
                messageDigest.update(this.f3243a.putLong(l7.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: L1.b0$b */
    class b implements C0131g.b {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f3244a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // p019C1.C0131g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo598a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f3244a) {
                this.f3244a.position(0);
                messageDigest.update(this.f3244a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: L1.b0$c */
    private static final class c implements e {
        private c() {
        }

        @Override // p091L1.C0809b0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3789a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // p091L1.C0809b0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3790b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: L1.b0$d */
    static final class d implements e {

        /* JADX INFO: renamed from: L1.b0$d$a */
        class a extends MediaDataSource {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ByteBuffer f3245a;

            a(ByteBuffer byteBuffer) {
                this.f3245a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f3245a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j7, byte[] bArr, int i7, int i8) {
                if (j7 >= this.f3245a.limit()) {
                    return -1;
                }
                this.f3245a.position((int) j7);
                int iMin = Math.min(i8, this.f3245a.remaining());
                this.f3245a.get(bArr, i7, iMin);
                return iMin;
            }
        }

        d() {
        }

        /* JADX INFO: renamed from: c */
        private MediaDataSource m3793c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // p091L1.C0809b0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3789a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(m3793c(byteBuffer));
        }

        @Override // p091L1.C0809b0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo3790b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(m3793c(byteBuffer));
        }
    }

    /* JADX INFO: renamed from: L1.b0$e */
    interface e {
        /* JADX INFO: renamed from: a */
        void mo3789a(MediaExtractor mediaExtractor, Object obj);

        /* JADX INFO: renamed from: b */
        void mo3790b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* JADX INFO: renamed from: L1.b0$f */
    static class f {
        f() {
        }

        /* JADX INFO: renamed from: a */
        public MediaMetadataRetriever m3796a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: renamed from: L1.b0$g */
    static final class g implements e {
        g() {
        }

        @Override // p091L1.C0809b0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3789a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // p091L1.C0809b0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3790b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: renamed from: L1.b0$h */
    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    C0809b0(InterfaceC0406d interfaceC0406d, e eVar) {
        this(interfaceC0406d, eVar, f3238f);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0134j m3776c(InterfaceC0406d interfaceC0406d) {
        return new C0809b0(interfaceC0406d, new c(null));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0134j m3777d(InterfaceC0406d interfaceC0406d) {
        return new C0809b0(interfaceC0406d, new d());
    }

    /* JADX INFO: renamed from: e */
    private static Bitmap m3778e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (m3783j()) {
            try {
                if (m3782i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable("VideoDecoder", 3)) {
                    return bitmap;
                }
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: f */
    private Bitmap m3779f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j7, int i7, int i8, int i9, AbstractC0823p abstractC0823p) {
        if (m3785l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapM3781h = (Build.VERSION.SDK_INT < 27 || i8 == Integer.MIN_VALUE || i9 == Integer.MIN_VALUE || abstractC0823p == AbstractC0823p.f3269f) ? null : m3781h(mediaMetadataRetriever, j7, i7, i8, i9, abstractC0823p);
        if (bitmapM3781h == null) {
            bitmapM3781h = m3780g(mediaMetadataRetriever, j7, i7);
        }
        Bitmap bitmapM3778e = m3778e(mediaMetadataRetriever, bitmapM3781h);
        if (bitmapM3778e != null) {
            return bitmapM3778e;
        }
        throw new h();
    }

    /* JADX INFO: renamed from: g */
    private static Bitmap m3780g(MediaMetadataRetriever mediaMetadataRetriever, long j7, int i7) {
        return mediaMetadataRetriever.getFrameAtTime(j7, i7);
    }

    /* JADX INFO: renamed from: h */
    private static Bitmap m3781h(MediaMetadataRetriever mediaMetadataRetriever, long j7, int i7, int i8, int i9, AbstractC0823p abstractC0823p) {
        try {
            int i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i11 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i12 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float fMo3843b = abstractC0823p.mo3843b(i10, i11, i8, i9);
            return mediaMetadataRetriever.getScaledFrameAtTime(j7, i7, Math.round(i10 * fMo3843b), Math.round(fMo3843b * i11));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m3782i(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i7 = Integer.parseInt(strExtractMetadata);
        return (i7 == 7 || i7 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* JADX INFO: renamed from: j */
    static boolean m3783j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m3784k();
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 30 && i7 < 33;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m3784k() {
        Iterator it = f3239g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:23:0x0053, B:25:0x0059), top: B:40:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: l */
    private boolean m3785l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f3240a.mo3789a(mediaExtractor2, obj);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i7 = 0; i7 < trackCount; i7++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i7).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable th) {
                    th = th;
                    mediaExtractor = mediaExtractor2;
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                    }
                }
                return false;
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC0134j m3786m(InterfaceC0406d interfaceC0406d) {
        return new C0809b0(interfaceC0406d, new g());
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: a */
    public InterfaceC0301v mo605a(Object obj, int i7, int i8, C0132h c0132h) throws Throwable {
        long jLongValue = ((Long) c0132h.m600c(f3236d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c0132h.m600c(f3237e);
        if (num == null) {
            num = 2;
        }
        AbstractC0823p abstractC0823p = (AbstractC0823p) c0132h.m600c(AbstractC0823p.f3271h);
        if (abstractC0823p == null) {
            abstractC0823p = AbstractC0823p.f3270g;
        }
        AbstractC0823p abstractC0823p2 = abstractC0823p;
        MediaMetadataRetriever mediaMetadataRetrieverM3796a = this.f3242c.m3796a();
        try {
            this.f3240a.mo3790b(mediaMetadataRetrieverM3796a, obj);
            try {
                Bitmap bitmapM3779f = m3779f(obj, mediaMetadataRetrieverM3796a, jLongValue, num.intValue(), i7, i8, abstractC0823p2);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetrieverM3796a.release();
                } else {
                    mediaMetadataRetrieverM3796a.release();
                }
                return C0814g.m3805f(bitmapM3779f, this.f3241b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetrieverM3796a.release();
                    throw th2;
                }
                mediaMetadataRetrieverM3796a.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: b */
    public boolean mo606b(Object obj, C0132h c0132h) {
        return true;
    }

    C0809b0(InterfaceC0406d interfaceC0406d, e eVar, f fVar) {
        this.f3241b = interfaceC0406d;
        this.f3240a = eVar;
        this.f3242c = fVar;
    }
}
