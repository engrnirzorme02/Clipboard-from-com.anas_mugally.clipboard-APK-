package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p043F1.InterfaceC0404b;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a */
        private final boolean f13783a;

        ImageType(boolean z7) {
            this.f13783a = z7;
        }

        public boolean hasAlpha() {
            return this.f13783a;
        }

        public boolean isWebp() {
            int i7 = C3213a.f13784a[ordinal()];
            return i7 == 1 || i7 == 2 || i7 == 3;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    static /* synthetic */ class C3213a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13784a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f13784a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13784a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13784a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    ImageType mo3827a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: b */
    int mo3828b(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b);

    /* JADX INFO: renamed from: c */
    boolean mo3829c(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b);

    /* JADX INFO: renamed from: d */
    ImageType mo3830d(InputStream inputStream);

    /* JADX INFO: renamed from: e */
    int mo3831e(InputStream inputStream, InterfaceC0404b interfaceC0404b);

    /* JADX INFO: renamed from: f */
    boolean mo3832f(InputStream inputStream, InterfaceC0404b interfaceC0404b);
}
