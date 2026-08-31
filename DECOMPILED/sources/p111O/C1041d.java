package p111O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: O.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1041d {

    /* JADX INFO: renamed from: a */
    private final f f3839a;

    /* JADX INFO: renamed from: O.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final c f3840a;

        public a(ClipData clipData, int i7) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3840a = new b(clipData, i7);
            } else {
                this.f3840a = new d(clipData, i7);
            }
        }

        /* JADX INFO: renamed from: a */
        public C1041d m4644a() {
            return this.f3840a.mo4648a();
        }

        /* JADX INFO: renamed from: b */
        public a m4645b(Bundle bundle) {
            this.f3840a.setExtras(bundle);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m4646c(int i7) {
            this.f3840a.mo4650c(i7);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m4647d(Uri uri) {
            this.f3840a.mo4649b(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: O.d$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a */
        private final ContentInfo.Builder f3841a;

        b(ClipData clipData, int i7) {
            this.f3841a = AbstractC1048g.m4665a(clipData, i7);
        }

        @Override // p111O.C1041d.c
        /* JADX INFO: renamed from: a */
        public C1041d mo4648a() {
            return new C1041d(new e(this.f3841a.build()));
        }

        @Override // p111O.C1041d.c
        /* JADX INFO: renamed from: b */
        public void mo4649b(Uri uri) {
            this.f3841a.setLinkUri(uri);
        }

        @Override // p111O.C1041d.c
        /* JADX INFO: renamed from: c */
        public void mo4650c(int i7) {
            this.f3841a.setFlags(i7);
        }

        @Override // p111O.C1041d.c
        public void setExtras(Bundle bundle) {
            this.f3841a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: O.d$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        C1041d mo4648a();

        /* JADX INFO: renamed from: b */
        void mo4649b(Uri uri);

        /* JADX INFO: renamed from: c */
        void mo4650c(int i7);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: O.d$d */
    private static final class d implements c {

        /* JADX INFO: renamed from: a */
        ClipData f3842a;

        /* JADX INFO: renamed from: b */
        int f3843b;

        /* JADX INFO: renamed from: c */
        int f3844c;

        /* JADX INFO: renamed from: d */
        Uri f3845d;

        /* JADX INFO: renamed from: e */
        Bundle f3846e;

        d(ClipData clipData, int i7) {
            this.f3842a = clipData;
            this.f3843b = i7;
        }

        @Override // p111O.C1041d.c
        /* JADX INFO: renamed from: a */
        public C1041d mo4648a() {
            return new C1041d(new g(this));
        }

        @Override // p111O.C1041d.c
        /* JADX INFO: renamed from: b */
        public void mo4649b(Uri uri) {
            this.f3845d = uri;
        }

        @Override // p111O.C1041d.c
        /* JADX INFO: renamed from: c */
        public void mo4650c(int i7) {
            this.f3844c = i7;
        }

        @Override // p111O.C1041d.c
        public void setExtras(Bundle bundle) {
            this.f3846e = bundle;
        }
    }

    /* JADX INFO: renamed from: O.d$e */
    private static final class e implements f {

        /* JADX INFO: renamed from: a */
        private final ContentInfo f3847a;

        e(ContentInfo contentInfo) {
            this.f3847a = AbstractC1038c.m4620a(AbstractC0910g.m4139g(contentInfo));
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: a */
        public ClipData mo4651a() {
            return this.f3847a.getClip();
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: b */
        public int mo4652b() {
            return this.f3847a.getFlags();
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: c */
        public ContentInfo mo4653c() {
            return this.f3847a;
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: d */
        public int mo4654d() {
            return this.f3847a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3847a + "}";
        }
    }

    /* JADX INFO: renamed from: O.d$f */
    private interface f {
        /* JADX INFO: renamed from: a */
        ClipData mo4651a();

        /* JADX INFO: renamed from: b */
        int mo4652b();

        /* JADX INFO: renamed from: c */
        ContentInfo mo4653c();

        /* JADX INFO: renamed from: d */
        int mo4654d();
    }

    /* JADX INFO: renamed from: O.d$g */
    private static final class g implements f {

        /* JADX INFO: renamed from: a */
        private final ClipData f3848a;

        /* JADX INFO: renamed from: b */
        private final int f3849b;

        /* JADX INFO: renamed from: c */
        private final int f3850c;

        /* JADX INFO: renamed from: d */
        private final Uri f3851d;

        /* JADX INFO: renamed from: e */
        private final Bundle f3852e;

        g(d dVar) {
            this.f3848a = (ClipData) AbstractC0910g.m4139g(dVar.f3842a);
            this.f3849b = AbstractC0910g.m4135c(dVar.f3843b, 0, 5, "source");
            this.f3850c = AbstractC0910g.m4138f(dVar.f3844c, 1);
            this.f3851d = dVar.f3845d;
            this.f3852e = dVar.f3846e;
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: a */
        public ClipData mo4651a() {
            return this.f3848a;
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: b */
        public int mo4652b() {
            return this.f3850c;
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: c */
        public ContentInfo mo4653c() {
            return null;
        }

        @Override // p111O.C1041d.f
        /* JADX INFO: renamed from: d */
        public int mo4654d() {
            return this.f3849b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f3848a.getDescription());
            sb.append(", source=");
            sb.append(C1041d.m4638e(this.f3849b));
            sb.append(", flags=");
            sb.append(C1041d.m4637a(this.f3850c));
            if (this.f3851d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f3851d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f3852e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C1041d(f fVar) {
        this.f3839a = fVar;
    }

    /* JADX INFO: renamed from: a */
    static String m4637a(int i7) {
        return (i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7);
    }

    /* JADX INFO: renamed from: e */
    static String m4638e(int i7) {
        if (i7 == 0) {
            return "SOURCE_APP";
        }
        if (i7 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i7 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i7 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i7 != 4) {
            return i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    /* JADX INFO: renamed from: g */
    public static C1041d m4639g(ContentInfo contentInfo) {
        return new C1041d(new e(contentInfo));
    }

    /* JADX INFO: renamed from: b */
    public ClipData m4640b() {
        return this.f3839a.mo4651a();
    }

    /* JADX INFO: renamed from: c */
    public int m4641c() {
        return this.f3839a.mo4652b();
    }

    /* JADX INFO: renamed from: d */
    public int m4642d() {
        return this.f3839a.mo4654d();
    }

    /* JADX INFO: renamed from: f */
    public ContentInfo m4643f() {
        ContentInfo contentInfoMo4653c = this.f3839a.mo4653c();
        Objects.requireNonNull(contentInfoMo4653c);
        return AbstractC1038c.m4620a(contentInfoMo4653c);
    }

    public String toString() {
        return this.f3839a.toString();
    }
}
