package p017C;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p009B.AbstractC0039b;

/* JADX INFO: renamed from: C.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111l {

    /* JADX INFO: renamed from: C.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        final Bundle f556a;

        /* JADX INFO: renamed from: b */
        private IconCompat f557b;

        /* JADX INFO: renamed from: c */
        private final AbstractC0119t[] f558c;

        /* JADX INFO: renamed from: d */
        private final AbstractC0119t[] f559d;

        /* JADX INFO: renamed from: e */
        private boolean f560e;

        /* JADX INFO: renamed from: f */
        boolean f561f;

        /* JADX INFO: renamed from: g */
        private final int f562g;

        /* JADX INFO: renamed from: h */
        private final boolean f563h;

        /* JADX INFO: renamed from: i */
        public int f564i;

        /* JADX INFO: renamed from: j */
        public CharSequence f565j;

        /* JADX INFO: renamed from: k */
        public PendingIntent f566k;

        /* JADX INFO: renamed from: l */
        private boolean f567l;

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.m10603c(null, "", i7) : null, charSequence, pendingIntent);
        }

        /* JADX INFO: renamed from: a */
        public PendingIntent m434a() {
            return this.f566k;
        }

        /* JADX INFO: renamed from: b */
        public boolean m435b() {
            return this.f560e;
        }

        /* JADX INFO: renamed from: c */
        public Bundle m436c() {
            return this.f556a;
        }

        /* JADX INFO: renamed from: d */
        public IconCompat m437d() {
            int i7;
            if (this.f557b == null && (i7 = this.f564i) != 0) {
                this.f557b = IconCompat.m10603c(null, "", i7);
            }
            return this.f557b;
        }

        /* JADX INFO: renamed from: e */
        public AbstractC0119t[] m438e() {
            return this.f558c;
        }

        /* JADX INFO: renamed from: f */
        public int m439f() {
            return this.f562g;
        }

        /* JADX INFO: renamed from: g */
        public boolean m440g() {
            return this.f561f;
        }

        /* JADX INFO: renamed from: h */
        public CharSequence m441h() {
            return this.f565j;
        }

        /* JADX INFO: renamed from: i */
        public boolean m442i() {
            return this.f567l;
        }

        /* JADX INFO: renamed from: j */
        public boolean m443j() {
            return this.f563h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC0119t[] abstractC0119tArr, AbstractC0119t[] abstractC0119tArr2, boolean z7, int i7, boolean z8, boolean z9, boolean z10) {
            this.f561f = true;
            this.f557b = iconCompat;
            if (iconCompat != null && iconCompat.m10608g() == 2) {
                this.f564i = iconCompat.m10606e();
            }
            this.f565j = e.m457d(charSequence);
            this.f566k = pendingIntent;
            this.f556a = bundle == null ? new Bundle() : bundle;
            this.f558c = abstractC0119tArr;
            this.f559d = abstractC0119tArr2;
            this.f560e = z7;
            this.f562g = i7;
            this.f561f = z8;
            this.f563h = z9;
            this.f567l = z10;
        }
    }

    /* JADX INFO: renamed from: C.l$b */
    public static class b extends g {

        /* JADX INFO: renamed from: e */
        private IconCompat f568e;

        /* JADX INFO: renamed from: f */
        private IconCompat f569f;

        /* JADX INFO: renamed from: g */
        private boolean f570g;

        /* JADX INFO: renamed from: h */
        private CharSequence f571h;

        /* JADX INFO: renamed from: i */
        private boolean f572i;

        /* JADX INFO: renamed from: C.l$b$a */
        private static class a {
            /* JADX INFO: renamed from: a */
            static void m450a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: C.l$b$b, reason: collision with other inner class name */
        private static class C7622b {
            /* JADX INFO: renamed from: a */
            static void m451a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* JADX INFO: renamed from: b */
            static void m452b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* JADX INFO: renamed from: c */
            static void m453c(Notification.BigPictureStyle bigPictureStyle, boolean z7) {
                bigPictureStyle.showBigPictureWhenCollapsed(z7);
            }
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: b */
        public void mo444b(InterfaceC0110k interfaceC0110k) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC0110k.mo431a()).setBigContentTitle(this.f623b);
            IconCompat iconCompat = this.f568e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C7622b.m451a(bigContentTitle, this.f568e.m10614m(interfaceC0110k instanceof C0112m ? ((C0112m) interfaceC0110k).m500f() : null));
                } else if (iconCompat.m10608g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f568e.m10605d());
                }
            }
            if (this.f570g) {
                if (this.f569f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.m450a(bigContentTitle, this.f569f.m10614m(interfaceC0110k instanceof C0112m ? ((C0112m) interfaceC0110k).m500f() : null));
                }
            }
            if (this.f625d) {
                bigContentTitle.setSummaryText(this.f624c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C7622b.m453c(bigContentTitle, this.f572i);
                C7622b.m452b(bigContentTitle, this.f571h);
            }
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: c */
        protected String mo445c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* JADX INFO: renamed from: h */
        public b m446h(Bitmap bitmap) {
            this.f569f = bitmap == null ? null : IconCompat.m10602b(bitmap);
            this.f570g = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m447i(Bitmap bitmap) {
            this.f568e = bitmap == null ? null : IconCompat.m10602b(bitmap);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m448j(CharSequence charSequence) {
            this.f623b = e.m457d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m449k(CharSequence charSequence) {
            this.f624c = e.m457d(charSequence);
            this.f625d = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: C.l$c */
    public static class c extends g {

        /* JADX INFO: renamed from: e */
        private CharSequence f573e;

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: a */
        public void mo454a(Bundle bundle) {
            super.mo454a(bundle);
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: b */
        public void mo444b(InterfaceC0110k interfaceC0110k) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0110k.mo431a()).setBigContentTitle(this.f623b).bigText(this.f573e);
            if (this.f625d) {
                bigTextStyleBigText.setSummaryText(this.f624c);
            }
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: c */
        protected String mo445c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* JADX INFO: renamed from: h */
        public c m455h(CharSequence charSequence) {
            this.f573e = e.m457d(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: C.l$d */
    public static final class d {
        /* JADX INFO: renamed from: a */
        public static Notification.BubbleMetadata m456a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C.l$f */
    public static class f extends g {

        /* JADX INFO: renamed from: C.l$f$a */
        static class a {
            /* JADX INFO: renamed from: a */
            static Notification.Style m493a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: b */
        public void mo444b(InterfaceC0110k interfaceC0110k) {
            interfaceC0110k.mo431a().setStyle(a.m493a());
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: c */
        protected String mo445c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: d */
        public RemoteViews mo490d(InterfaceC0110k interfaceC0110k) {
            return null;
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: e */
        public RemoteViews mo491e(InterfaceC0110k interfaceC0110k) {
            return null;
        }

        @Override // p017C.AbstractC0111l.g
        /* JADX INFO: renamed from: f */
        public RemoteViews mo492f(InterfaceC0110k interfaceC0110k) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C.l$g */
    public static abstract class g {

        /* JADX INFO: renamed from: a */
        protected e f622a;

        /* JADX INFO: renamed from: b */
        CharSequence f623b;

        /* JADX INFO: renamed from: c */
        CharSequence f624c;

        /* JADX INFO: renamed from: d */
        boolean f625d = false;

        /* JADX INFO: renamed from: a */
        public void mo454a(Bundle bundle) {
            if (this.f625d) {
                bundle.putCharSequence("android.summaryText", this.f624c);
            }
            CharSequence charSequence = this.f623b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strMo445c = mo445c();
            if (strMo445c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo445c);
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo444b(InterfaceC0110k interfaceC0110k);

        /* JADX INFO: renamed from: c */
        protected abstract String mo445c();

        /* JADX INFO: renamed from: d */
        public RemoteViews mo490d(InterfaceC0110k interfaceC0110k) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public RemoteViews mo491e(InterfaceC0110k interfaceC0110k) {
            return null;
        }

        /* JADX INFO: renamed from: f */
        public RemoteViews mo492f(InterfaceC0110k interfaceC0110k) {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public void m494g(e eVar) {
            if (this.f622a != eVar) {
                this.f622a = eVar;
                if (eVar != null) {
                    eVar.m484y(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m432a(Notification notification) {
        return notification.extras;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m433b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC0039b.f283b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC0039b.f282a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: renamed from: C.l$e */
    public static class e {

        /* JADX INFO: renamed from: A */
        boolean f574A;

        /* JADX INFO: renamed from: B */
        boolean f575B;

        /* JADX INFO: renamed from: C */
        boolean f576C;

        /* JADX INFO: renamed from: D */
        String f577D;

        /* JADX INFO: renamed from: E */
        Bundle f578E;

        /* JADX INFO: renamed from: F */
        int f579F;

        /* JADX INFO: renamed from: G */
        int f580G;

        /* JADX INFO: renamed from: H */
        Notification f581H;

        /* JADX INFO: renamed from: I */
        RemoteViews f582I;

        /* JADX INFO: renamed from: J */
        RemoteViews f583J;

        /* JADX INFO: renamed from: K */
        RemoteViews f584K;

        /* JADX INFO: renamed from: L */
        String f585L;

        /* JADX INFO: renamed from: M */
        int f586M;

        /* JADX INFO: renamed from: N */
        String f587N;

        /* JADX INFO: renamed from: O */
        long f588O;

        /* JADX INFO: renamed from: P */
        int f589P;

        /* JADX INFO: renamed from: Q */
        int f590Q;

        /* JADX INFO: renamed from: R */
        boolean f591R;

        /* JADX INFO: renamed from: S */
        Notification f592S;

        /* JADX INFO: renamed from: T */
        boolean f593T;

        /* JADX INFO: renamed from: U */
        Object f594U;

        /* JADX INFO: renamed from: V */
        public ArrayList f595V;

        /* JADX INFO: renamed from: a */
        public Context f596a;

        /* JADX INFO: renamed from: b */
        public ArrayList f597b;

        /* JADX INFO: renamed from: c */
        public ArrayList f598c;

        /* JADX INFO: renamed from: d */
        ArrayList f599d;

        /* JADX INFO: renamed from: e */
        CharSequence f600e;

        /* JADX INFO: renamed from: f */
        CharSequence f601f;

        /* JADX INFO: renamed from: g */
        String f602g;

        /* JADX INFO: renamed from: h */
        PendingIntent f603h;

        /* JADX INFO: renamed from: i */
        PendingIntent f604i;

        /* JADX INFO: renamed from: j */
        RemoteViews f605j;

        /* JADX INFO: renamed from: k */
        IconCompat f606k;

        /* JADX INFO: renamed from: l */
        CharSequence f607l;

        /* JADX INFO: renamed from: m */
        int f608m;

        /* JADX INFO: renamed from: n */
        int f609n;

        /* JADX INFO: renamed from: o */
        boolean f610o;

        /* JADX INFO: renamed from: p */
        boolean f611p;

        /* JADX INFO: renamed from: q */
        g f612q;

        /* JADX INFO: renamed from: r */
        CharSequence f613r;

        /* JADX INFO: renamed from: s */
        CharSequence f614s;

        /* JADX INFO: renamed from: t */
        CharSequence[] f615t;

        /* JADX INFO: renamed from: u */
        int f616u;

        /* JADX INFO: renamed from: v */
        int f617v;

        /* JADX INFO: renamed from: w */
        boolean f618w;

        /* JADX INFO: renamed from: x */
        String f619x;

        /* JADX INFO: renamed from: y */
        boolean f620y;

        /* JADX INFO: renamed from: z */
        String f621z;

        /* JADX INFO: renamed from: C.l$e$a */
        static class a {
            /* JADX INFO: renamed from: a */
            static AudioAttributes m486a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* JADX INFO: renamed from: b */
            static AudioAttributes.Builder m487b() {
                return new AudioAttributes.Builder();
            }

            /* JADX INFO: renamed from: c */
            static AudioAttributes.Builder m488c(AudioAttributes.Builder builder, int i7) {
                return builder.setContentType(i7);
            }

            /* JADX INFO: renamed from: d */
            static AudioAttributes.Builder m489d(AudioAttributes.Builder builder, int i7) {
                return builder.setUsage(i7);
            }
        }

        public e(Context context, String str) {
            this.f597b = new ArrayList();
            this.f598c = new ArrayList();
            this.f599d = new ArrayList();
            this.f610o = true;
            this.f574A = false;
            this.f579F = 0;
            this.f580G = 0;
            this.f586M = 0;
            this.f589P = 0;
            this.f590Q = 0;
            Notification notification = new Notification();
            this.f592S = notification;
            this.f596a = context;
            this.f585L = str;
            notification.when = System.currentTimeMillis();
            this.f592S.audioStreamType = -1;
            this.f609n = 0;
            this.f595V = new ArrayList();
            this.f591R = true;
        }

        /* JADX INFO: renamed from: d */
        protected static CharSequence m457d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* JADX INFO: renamed from: o */
        private void m458o(int i7, boolean z7) {
            if (z7) {
                Notification notification = this.f592S;
                notification.flags = i7 | notification.flags;
            } else {
                Notification notification2 = this.f592S;
                notification2.flags = (~i7) & notification2.flags;
            }
        }

        /* JADX INFO: renamed from: A */
        public e m459A(long[] jArr) {
            this.f592S.vibrate = jArr;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public e m460B(int i7) {
            this.f580G = i7;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public e m461C(long j7) {
            this.f592S.when = j7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public e m462a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f597b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Notification m463b() {
            return new C0112m(this).m498c();
        }

        /* JADX INFO: renamed from: c */
        public Bundle m464c() {
            if (this.f578E == null) {
                this.f578E = new Bundle();
            }
            return this.f578E;
        }

        /* JADX INFO: renamed from: e */
        public e m465e(boolean z7) {
            m458o(16, z7);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public e m466f(String str) {
            this.f585L = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public e m467g(int i7) {
            this.f579F = i7;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public e m468h(PendingIntent pendingIntent) {
            this.f603h = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public e m469i(CharSequence charSequence) {
            this.f601f = m457d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public e m470j(CharSequence charSequence) {
            this.f600e = m457d(charSequence);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public e m471k(RemoteViews remoteViews) {
            this.f583J = remoteViews;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public e m472l(RemoteViews remoteViews) {
            this.f582I = remoteViews;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public e m473m(int i7) {
            Notification notification = this.f592S;
            notification.defaults = i7;
            if ((i7 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* JADX INFO: renamed from: n */
        public e m474n(PendingIntent pendingIntent) {
            this.f592S.deleteIntent = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public e m475p(Bitmap bitmap) {
            this.f606k = bitmap == null ? null : IconCompat.m10602b(AbstractC0111l.m433b(this.f596a, bitmap));
            return this;
        }

        /* JADX INFO: renamed from: q */
        public e m476q(int i7, int i8, int i9) {
            Notification notification = this.f592S;
            notification.ledARGB = i7;
            notification.ledOnMS = i8;
            notification.ledOffMS = i9;
            notification.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* JADX INFO: renamed from: r */
        public e m477r(boolean z7) {
            this.f574A = z7;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public e m478s(int i7) {
            this.f608m = i7;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public e m479t(boolean z7) {
            m458o(8, z7);
            return this;
        }

        /* JADX INFO: renamed from: u */
        public e m480u(int i7) {
            this.f609n = i7;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public e m481v(boolean z7) {
            this.f610o = z7;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public e m482w(int i7) {
            this.f592S.icon = i7;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public e m483x(Uri uri) {
            Notification notification = this.f592S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderM489d = a.m489d(a.m488c(a.m487b(), 4), 5);
            this.f592S.audioAttributes = a.m486a(builderM489d);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public e m484y(g gVar) {
            if (this.f612q != gVar) {
                this.f612q = gVar;
                if (gVar != null) {
                    gVar.m494g(this);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: z */
        public e m485z(CharSequence charSequence) {
            this.f592S.tickerText = m457d(charSequence);
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
