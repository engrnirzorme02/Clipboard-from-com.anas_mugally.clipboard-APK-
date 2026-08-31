package p017C;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.AbstractC2263x;
import androidx.collection.C2391b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: C.m */
/* JADX INFO: loaded from: classes.dex */
class C0112m implements InterfaceC0110k {

    /* JADX INFO: renamed from: a */
    private final Context f626a;

    /* JADX INFO: renamed from: b */
    private final Notification.Builder f627b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0111l.e f628c;

    /* JADX INFO: renamed from: d */
    private RemoteViews f629d;

    /* JADX INFO: renamed from: e */
    private RemoteViews f630e;

    /* JADX INFO: renamed from: f */
    private final List f631f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final Bundle f632g = new Bundle();

    /* JADX INFO: renamed from: h */
    private int f633h;

    /* JADX INFO: renamed from: i */
    private RemoteViews f634i;

    /* JADX INFO: renamed from: C.m$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m501a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Action.Builder m502b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Action.Builder m503c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Action m504d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m505e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* JADX INFO: renamed from: f */
        static Notification.Builder m506f(Notification.Builder builder, boolean z7) {
            return builder.setGroupSummary(z7);
        }

        /* JADX INFO: renamed from: g */
        static Notification.Builder m507g(Notification.Builder builder, boolean z7) {
            return builder.setLocalOnly(z7);
        }

        /* JADX INFO: renamed from: h */
        static Notification.Builder m508h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: C.m$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m509a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m510b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m511c(Notification.Builder builder, int i7) {
            return builder.setColor(i7);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Builder m512d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m513e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* JADX INFO: renamed from: f */
        static Notification.Builder m514f(Notification.Builder builder, int i7) {
            return builder.setVisibility(i7);
        }
    }

    /* JADX INFO: renamed from: C.m$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m515a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m516b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m517c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: C.m$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m518a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAllowGeneratedReplies(z7);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m519b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m520c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Builder m521d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m522e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: C.m$e */
    static class e {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m523a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m524b(Notification.Builder builder, int i7) {
            return builder.setBadgeIconType(i7);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Builder m525c(Notification.Builder builder, boolean z7) {
            return builder.setColorized(z7);
        }

        /* JADX INFO: renamed from: d */
        static Notification.Builder m526d(Notification.Builder builder, int i7) {
            return builder.setGroupAlertBehavior(i7);
        }

        /* JADX INFO: renamed from: e */
        static Notification.Builder m527e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* JADX INFO: renamed from: f */
        static Notification.Builder m528f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* JADX INFO: renamed from: g */
        static Notification.Builder m529g(Notification.Builder builder, long j7) {
            return builder.setTimeoutAfter(j7);
        }
    }

    /* JADX INFO: renamed from: C.m$f */
    static class f {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m530a(Notification.Action.Builder builder, int i7) {
            return builder.setSemanticAction(i7);
        }
    }

    /* JADX INFO: renamed from: C.m$g */
    static class g {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m531a(Notification.Builder builder, boolean z7) {
            return builder.setAllowSystemGeneratedContextualActions(z7);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m532b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* JADX INFO: renamed from: c */
        static Notification.Action.Builder m533c(Notification.Action.Builder builder, boolean z7) {
            return builder.setContextual(z7);
        }
    }

    /* JADX INFO: renamed from: C.m$h */
    static class h {
        /* JADX INFO: renamed from: a */
        static Notification.Action.Builder m534a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAuthenticationRequired(z7);
        }

        /* JADX INFO: renamed from: b */
        static Notification.Builder m535b(Notification.Builder builder, int i7) {
            return builder.setForegroundServiceBehavior(i7);
        }
    }

    /* JADX INFO: renamed from: C.m$i */
    static final class i {
        /* JADX INFO: renamed from: a */
        static Notification.Builder m536a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    C0112m(AbstractC0111l.e eVar) {
        int i7;
        this.f628c = eVar;
        Context context = eVar.f596a;
        this.f626a = context;
        Notification.Builder builderM523a = e.m523a(context, eVar.f585L);
        this.f627b = builderM523a;
        Notification notification = eVar.f592S;
        builderM523a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f605j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f600e).setContentText(eVar.f601f).setContentInfo(eVar.f607l).setContentIntent(eVar.f603h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f604i, (notification.flags & 128) != 0).setNumber(eVar.f608m).setProgress(eVar.f616u, eVar.f617v, eVar.f618w);
        IconCompat iconCompat = eVar.f606k;
        c.m516b(builderM523a, iconCompat == null ? null : iconCompat.m10614m(context));
        builderM523a.setSubText(eVar.f613r).setUsesChronometer(eVar.f611p).setPriority(eVar.f609n);
        Iterator it = eVar.f597b.iterator();
        while (it.hasNext()) {
            m495b((AbstractC0111l.a) it.next());
        }
        Bundle bundle = eVar.f578E;
        if (bundle != null) {
            this.f632g.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f629d = eVar.f582I;
        this.f630e = eVar.f583J;
        this.f627b.setShowWhen(eVar.f610o);
        a.m507g(this.f627b, eVar.f574A);
        a.m505e(this.f627b, eVar.f619x);
        a.m508h(this.f627b, eVar.f621z);
        a.m506f(this.f627b, eVar.f620y);
        this.f633h = eVar.f589P;
        b.m510b(this.f627b, eVar.f577D);
        b.m511c(this.f627b, eVar.f579F);
        b.m514f(this.f627b, eVar.f580G);
        b.m512d(this.f627b, eVar.f581H);
        b.m513e(this.f627b, notification.sound, notification.audioAttributes);
        List listM496e = i8 < 28 ? m496e(m497g(eVar.f598c), eVar.f595V) : eVar.f595V;
        if (listM496e != null && !listM496e.isEmpty()) {
            Iterator it2 = listM496e.iterator();
            while (it2.hasNext()) {
                b.m509a(this.f627b, (String) it2.next());
            }
        }
        this.f634i = eVar.f584K;
        if (eVar.f599d.size() > 0) {
            Bundle bundle2 = eVar.m464c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < eVar.f599d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), AbstractC0113n.m537a((AbstractC0111l.a) eVar.f599d.get(i9)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.m464c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f632g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = eVar.f594U;
        if (obj != null) {
            c.m517c(this.f627b, obj);
        }
        this.f627b.setExtras(eVar.f578E);
        d.m522e(this.f627b, eVar.f615t);
        RemoteViews remoteViews = eVar.f582I;
        if (remoteViews != null) {
            d.m520c(this.f627b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f583J;
        if (remoteViews2 != null) {
            d.m519b(this.f627b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f584K;
        if (remoteViews3 != null) {
            d.m521d(this.f627b, remoteViews3);
        }
        e.m524b(this.f627b, eVar.f586M);
        e.m527e(this.f627b, eVar.f614s);
        e.m528f(this.f627b, eVar.f587N);
        e.m529g(this.f627b, eVar.f588O);
        e.m526d(this.f627b, eVar.f589P);
        if (eVar.f576C) {
            e.m525c(this.f627b, eVar.f575B);
        }
        if (!TextUtils.isEmpty(eVar.f585L)) {
            this.f627b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i10 >= 28) {
            Iterator it3 = eVar.f598c.iterator();
            if (it3.hasNext()) {
                AbstractC2263x.m9328a(it3.next());
                throw null;
            }
        }
        if (i10 >= 29) {
            g.m531a(this.f627b, eVar.f591R);
            g.m532b(this.f627b, AbstractC0111l.d.m456a(null));
        }
        if (i10 >= 31 && (i7 = eVar.f590Q) != 0) {
            h.m535b(this.f627b, i7);
        }
        if (i10 >= 36) {
            i.m536a(this.f627b, eVar.f602g);
        }
        if (eVar.f593T) {
            if (this.f628c.f620y) {
                this.f633h = 2;
            } else {
                this.f633h = 1;
            }
            this.f627b.setVibrate(null);
            this.f627b.setSound(null);
            int i11 = notification.defaults & (-4);
            notification.defaults = i11;
            this.f627b.setDefaults(i11);
            if (TextUtils.isEmpty(this.f628c.f619x)) {
                a.m505e(this.f627b, "silent");
            }
            e.m526d(this.f627b, this.f633h);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m495b(AbstractC0111l.a aVar) {
        IconCompat iconCompatM437d = aVar.m437d();
        Notification.Action.Builder builderM515a = c.m515a(iconCompatM437d != null ? iconCompatM437d.m10613l() : null, aVar.m441h(), aVar.m434a());
        if (aVar.m438e() != null) {
            for (RemoteInput remoteInput : AbstractC0119t.m567b(aVar.m438e())) {
                a.m503c(builderM515a, remoteInput);
            }
        }
        Bundle bundle = aVar.m436c() != null ? new Bundle(aVar.m436c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m435b());
        int i7 = Build.VERSION.SDK_INT;
        d.m518a(builderM515a, aVar.m435b());
        bundle.putInt("android.support.action.semanticAction", aVar.m439f());
        if (i7 >= 28) {
            f.m530a(builderM515a, aVar.m439f());
        }
        if (i7 >= 29) {
            g.m533c(builderM515a, aVar.m443j());
        }
        if (i7 >= 31) {
            h.m534a(builderM515a, aVar.m442i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m440g());
        a.m502b(builderM515a, bundle);
        a.m501a(this.f627b, a.m504d(builderM515a));
    }

    /* JADX INFO: renamed from: e */
    private static List m496e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C2391b c2391b = new C2391b(list.size() + list2.size());
        c2391b.addAll(list);
        c2391b.addAll(list2);
        return new ArrayList(c2391b);
    }

    /* JADX INFO: renamed from: g */
    private static List m497g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC2263x.m9328a(it.next());
        throw null;
    }

    @Override // p017C.InterfaceC0110k
    /* JADX INFO: renamed from: a */
    public Notification.Builder mo431a() {
        return this.f627b;
    }

    /* JADX INFO: renamed from: c */
    public Notification m498c() {
        Bundle bundleM432a;
        RemoteViews remoteViewsMo492f;
        RemoteViews remoteViewsMo490d;
        AbstractC0111l.g gVar = this.f628c.f612q;
        if (gVar != null) {
            gVar.mo444b(this);
        }
        RemoteViews remoteViewsMo491e = gVar != null ? gVar.mo491e(this) : null;
        Notification notificationM499d = m499d();
        if (remoteViewsMo491e != null) {
            notificationM499d.contentView = remoteViewsMo491e;
        } else {
            RemoteViews remoteViews = this.f628c.f582I;
            if (remoteViews != null) {
                notificationM499d.contentView = remoteViews;
            }
        }
        if (gVar != null && (remoteViewsMo490d = gVar.mo490d(this)) != null) {
            notificationM499d.bigContentView = remoteViewsMo490d;
        }
        if (gVar != null && (remoteViewsMo492f = this.f628c.f612q.mo492f(this)) != null) {
            notificationM499d.headsUpContentView = remoteViewsMo492f;
        }
        if (gVar != null && (bundleM432a = AbstractC0111l.m432a(notificationM499d)) != null) {
            gVar.mo454a(bundleM432a);
        }
        return notificationM499d;
    }

    /* JADX INFO: renamed from: d */
    protected Notification m499d() {
        return this.f627b.build();
    }

    /* JADX INFO: renamed from: f */
    Context m500f() {
        return this.f626a;
    }
}
