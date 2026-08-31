package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p043F1.InterfaceC0404b;
import p091L1.C0801V;
import p183Y1.AbstractC2012a;

/* JADX INFO: renamed from: com.bumptech.glide.load.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3214a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a */
    class a implements l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f13785a;

        a(InputStream inputStream) {
            this.f13785a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.l
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo17099a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3830d(this.f13785a);
            } finally {
                this.f13785a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$b */
    class b implements l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f13786a;

        b(ByteBuffer byteBuffer) {
            this.f13786a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.l
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo17099a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo3827a(this.f13786a);
            } finally {
                AbstractC2012a.m8376d(this.f13786a);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$c */
    class c implements l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f13787a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13788b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0404b interfaceC0404b) {
            this.f13787a = parcelFileDescriptorRewinder;
            this.f13788b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.l
        /* JADX INFO: renamed from: a */
        public ImageHeaderParser.ImageType mo17099a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C0801V c0801v = null;
            try {
                C0801V c0801v2 = new C0801V(new FileInputStream(this.f13787a.mo4040a().getFileDescriptor()), this.f13788b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo3830d = imageHeaderParser.mo3830d(c0801v2);
                    c0801v2.m3749n();
                    this.f13787a.mo4040a();
                    return imageTypeMo3830d;
                } catch (Throwable th) {
                    th = th;
                    c0801v = c0801v2;
                    if (c0801v != null) {
                        c0801v.m3749n();
                    }
                    this.f13787a.mo4040a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$d */
    class d implements k {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f13789a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13790b;

        d(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
            this.f13789a = byteBuffer;
            this.f13790b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.k
        /* JADX INFO: renamed from: a */
        public int mo17100a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo3828b(this.f13789a, this.f13790b);
            } finally {
                AbstractC2012a.m8376d(this.f13789a);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$e */
    class e implements k {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f13791a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13792b;

        e(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
            this.f13791a = inputStream;
            this.f13792b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.k
        /* JADX INFO: renamed from: a */
        public int mo17100a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3831e(this.f13791a, this.f13792b);
            } finally {
                this.f13791a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$f */
    class f implements k {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f13793a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13794b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0404b interfaceC0404b) {
            this.f13793a = parcelFileDescriptorRewinder;
            this.f13794b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.k
        /* JADX INFO: renamed from: a */
        public int mo17100a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C0801V c0801v = null;
            try {
                C0801V c0801v2 = new C0801V(new FileInputStream(this.f13793a.mo4040a().getFileDescriptor()), this.f13794b);
                try {
                    int iMo3831e = imageHeaderParser.mo3831e(c0801v2, this.f13794b);
                    c0801v2.m3749n();
                    this.f13793a.mo4040a();
                    return iMo3831e;
                } catch (Throwable th) {
                    th = th;
                    c0801v = c0801v2;
                    if (c0801v != null) {
                        c0801v.m3749n();
                    }
                    this.f13793a.mo4040a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$g */
    class g implements j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ByteBuffer f13795a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13796b;

        g(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
            this.f13795a = byteBuffer;
            this.f13796b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.j
        /* JADX INFO: renamed from: a */
        public boolean mo17101a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo3829c(this.f13795a, this.f13796b);
            } finally {
                AbstractC2012a.m8376d(this.f13795a);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$h */
    class h implements j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f13797a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13798b;

        h(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
            this.f13797a = inputStream;
            this.f13798b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.j
        /* JADX INFO: renamed from: a */
        public boolean mo17101a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo3832f(this.f13797a, this.f13798b);
            } finally {
                this.f13797a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$i */
    class i implements j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f13799a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0404b f13800b;

        i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0404b interfaceC0404b) {
            this.f13799a = parcelFileDescriptorRewinder;
            this.f13800b = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.AbstractC3214a.j
        /* JADX INFO: renamed from: a */
        public boolean mo17101a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C0801V c0801v = null;
            try {
                C0801V c0801v2 = new C0801V(new FileInputStream(this.f13799a.mo4040a().getFileDescriptor()), this.f13800b);
                try {
                    boolean zMo3832f = imageHeaderParser.mo3832f(c0801v2, this.f13800b);
                    c0801v2.m3749n();
                    this.f13799a.mo4040a();
                    return zMo3832f;
                } catch (Throwable th) {
                    th = th;
                    c0801v = c0801v2;
                    if (c0801v != null) {
                        c0801v.m3749n();
                    }
                    this.f13799a.mo4040a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$j */
    private interface j {
        /* JADX INFO: renamed from: a */
        boolean mo17101a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$k */
    private interface k {
        /* JADX INFO: renamed from: a */
        int mo17100a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$l */
    private interface l {
        /* JADX INFO: renamed from: a */
        ImageHeaderParser.ImageType mo17099a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: renamed from: a */
    public static int m17087a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0404b interfaceC0404b) {
        return m17090d(list, new f(parcelFileDescriptorRewinder, interfaceC0404b));
    }

    /* JADX INFO: renamed from: b */
    public static int m17088b(List list, InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0801V(inputStream, interfaceC0404b);
        }
        inputStream.mark(5242880);
        return m17090d(list, new e(inputStream, interfaceC0404b));
    }

    /* JADX INFO: renamed from: c */
    public static int m17089c(List list, ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
        if (byteBuffer == null) {
            return -1;
        }
        return m17090d(list, new d(byteBuffer, interfaceC0404b));
    }

    /* JADX INFO: renamed from: d */
    private static int m17090d(List list, k kVar) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iMo17100a = kVar.mo17100a((ImageHeaderParser) list.get(i7));
            if (iMo17100a != -1) {
                return iMo17100a;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static ImageHeaderParser.ImageType m17091e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0404b interfaceC0404b) {
        return m17094h(list, new c(parcelFileDescriptorRewinder, interfaceC0404b));
    }

    /* JADX INFO: renamed from: f */
    public static ImageHeaderParser.ImageType m17092f(List list, InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0801V(inputStream, interfaceC0404b);
        }
        inputStream.mark(5242880);
        return m17094h(list, new a(inputStream));
    }

    /* JADX INFO: renamed from: g */
    public static ImageHeaderParser.ImageType m17093g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m17094h(list, new b(byteBuffer));
    }

    /* JADX INFO: renamed from: h */
    private static ImageHeaderParser.ImageType m17094h(List list, l lVar) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ImageHeaderParser.ImageType imageTypeMo17099a = lVar.mo17099a((ImageHeaderParser) list.get(i7));
            if (imageTypeMo17099a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo17099a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17095i(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC0404b interfaceC0404b) {
        return m17098l(list, new i(parcelFileDescriptorRewinder, interfaceC0404b));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m17096j(List list, InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C0801V(inputStream, interfaceC0404b);
        }
        inputStream.mark(5242880);
        return m17098l(list, new h(inputStream, interfaceC0404b));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m17097k(List list, ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
        if (byteBuffer == null) {
            return false;
        }
        return m17098l(list, new g(byteBuffer, interfaceC0404b));
    }

    /* JADX INFO: renamed from: l */
    private static boolean m17098l(List list, j jVar) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (jVar.mo17101a((ImageHeaderParser) list.get(i7))) {
                return true;
            }
        }
        return false;
    }
}
