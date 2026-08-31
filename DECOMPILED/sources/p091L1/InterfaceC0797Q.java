package p091L1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC3214a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C3226k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p043F1.InterfaceC0404b;
import p183Y1.AbstractC2012a;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: L1.Q */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC0797Q {

    /* JADX INFO: renamed from: L1.Q$a */
    public static final class a implements InterfaceC0797Q {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f3201a;

        /* JADX INFO: renamed from: b */
        private final List f3202b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0404b f3203c;

        a(ByteBuffer byteBuffer, List list, InterfaceC0404b interfaceC0404b) {
            this.f3201a = byteBuffer;
            this.f3202b = list;
            this.f3203c = interfaceC0404b;
        }

        /* JADX INFO: renamed from: f */
        private InputStream m3738f() {
            return AbstractC2012a.m8379g(AbstractC2012a.m8376d(this.f3201a));
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: a */
        public int mo3733a() {
            return AbstractC3214a.m17089c(this.f3202b, AbstractC2012a.m8376d(this.f3201a), this.f3203c);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: b */
        public Bitmap mo3734b(BitmapFactory.Options options) {
            return AbstractC0794N.m3714b(m3738f(), options, this);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: c */
        public boolean mo3735c() {
            return AbstractC3214a.m17097k(this.f3202b, AbstractC2012a.m8376d(this.f3201a), this.f3203c);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: d */
        public void mo3736d() {
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: e */
        public ImageHeaderParser.ImageType mo3737e() {
            return AbstractC3214a.m17093g(this.f3202b, AbstractC2012a.m8376d(this.f3201a));
        }
    }

    /* JADX INFO: renamed from: L1.Q$b */
    public static final class b implements InterfaceC0797Q {

        /* JADX INFO: renamed from: a */
        private final C3226k f3204a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0404b f3205b;

        /* JADX INFO: renamed from: c */
        private final List f3206c;

        b(InputStream inputStream, List list, InterfaceC0404b interfaceC0404b) {
            this.f3205b = (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b);
            this.f3206c = (List) AbstractC2022k.m8408e(list);
            this.f3204a = new C3226k(inputStream, interfaceC0404b);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: a */
        public int mo3733a() {
            return AbstractC3214a.m17088b(this.f3206c, this.f3204a.mo4040a(), this.f3205b);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: b */
        public Bitmap mo3734b(BitmapFactory.Options options) {
            return AbstractC0794N.m3714b(this.f3204a.mo4040a(), options, this);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: c */
        public boolean mo3735c() {
            return AbstractC3214a.m17096j(this.f3206c, this.f3204a.mo4040a(), this.f3205b);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: d */
        public void mo3736d() {
            this.f3204a.m17127c();
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: e */
        public ImageHeaderParser.ImageType mo3737e() {
            return AbstractC3214a.m17092f(this.f3206c, this.f3204a.mo4040a(), this.f3205b);
        }
    }

    /* JADX INFO: renamed from: L1.Q$c */
    public static final class c implements InterfaceC0797Q {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0404b f3207a;

        /* JADX INFO: renamed from: b */
        private final List f3208b;

        /* JADX INFO: renamed from: c */
        private final ParcelFileDescriptorRewinder f3209c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, InterfaceC0404b interfaceC0404b) {
            this.f3207a = (InterfaceC0404b) AbstractC2022k.m8408e(interfaceC0404b);
            this.f3208b = (List) AbstractC2022k.m8408e(list);
            this.f3209c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: a */
        public int mo3733a() {
            return AbstractC3214a.m17087a(this.f3208b, this.f3209c, this.f3207a);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: b */
        public Bitmap mo3734b(BitmapFactory.Options options) {
            return AbstractC0794N.m3713a(this.f3209c.mo4040a().getFileDescriptor(), options, this);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: c */
        public boolean mo3735c() {
            return AbstractC3214a.m17095i(this.f3208b, this.f3209c, this.f3207a);
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: d */
        public void mo3736d() {
        }

        @Override // p091L1.InterfaceC0797Q
        /* JADX INFO: renamed from: e */
        public ImageHeaderParser.ImageType mo3737e() {
            return AbstractC3214a.m17091e(this.f3208b, this.f3209c, this.f3207a);
        }
    }

    /* JADX INFO: renamed from: a */
    int mo3733a();

    /* JADX INFO: renamed from: b */
    Bitmap mo3734b(BitmapFactory.Options options);

    /* JADX INFO: renamed from: c */
    boolean mo3735c();

    /* JADX INFO: renamed from: d */
    void mo3736d();

    /* JADX INFO: renamed from: e */
    ImageHeaderParser.ImageType mo3737e();
}
