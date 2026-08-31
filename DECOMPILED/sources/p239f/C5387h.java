package p239f;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: f.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5387h implements Parcelable {

    /* JADX INFO: renamed from: a */
    private final IntentSender f20518a;

    /* JADX INFO: renamed from: b */
    private final Intent f20519b;

    /* JADX INFO: renamed from: c */
    private final int f20520c;

    /* JADX INFO: renamed from: d */
    private final int f20521d;

    /* JADX INFO: renamed from: e */
    public static final c f20517e = new c(null);
    public static final Parcelable.Creator<C5387h> CREATOR = new b();

    /* JADX INFO: renamed from: f.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final IntentSender f20522a;

        /* JADX INFO: renamed from: b */
        private Intent f20523b;

        /* JADX INFO: renamed from: c */
        private int f20524c;

        /* JADX INFO: renamed from: d */
        private int f20525d;

        public a(IntentSender intentSender) {
            AbstractC6118n.m27187e(intentSender, "intentSender");
            this.f20522a = intentSender;
        }

        /* JADX INFO: renamed from: a */
        public final C5387h m24420a() {
            return new C5387h(this.f20522a, this.f20523b, this.f20524c, this.f20525d);
        }

        /* JADX INFO: renamed from: b */
        public final a m24421b(Intent intent) {
            this.f20523b = intent;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m24422c(int i7, int i8) {
            this.f20525d = i7;
            this.f20524c = i8;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            AbstractC6118n.m27187e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            AbstractC6118n.m27186d(intentSender, "getIntentSender(...)");
            this(intentSender);
        }
    }

    /* JADX INFO: renamed from: f.h$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5387h createFromParcel(Parcel inParcel) {
            AbstractC6118n.m27187e(inParcel, "inParcel");
            return new C5387h(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5387h[] newArray(int i7) {
            return new C5387h[i7];
        }
    }

    /* JADX INFO: renamed from: f.h$c */
    public static final class c {
        public /* synthetic */ c(AbstractC6112h abstractC6112h) {
            this();
        }

        private c() {
        }
    }

    public C5387h(IntentSender intentSender, Intent intent, int i7, int i8) {
        AbstractC6118n.m27187e(intentSender, "intentSender");
        this.f20518a = intentSender;
        this.f20519b = intent;
        this.f20520c = i7;
        this.f20521d = i8;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m24416a() {
        return this.f20519b;
    }

    /* JADX INFO: renamed from: b */
    public final int m24417b() {
        return this.f20520c;
    }

    /* JADX INFO: renamed from: c */
    public final int m24418c() {
        return this.f20521d;
    }

    /* JADX INFO: renamed from: d */
    public final IntentSender m24419d() {
        return this.f20518a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        AbstractC6118n.m27187e(dest, "dest");
        dest.writeParcelable(this.f20518a, i7);
        dest.writeParcelable(this.f20519b, i7);
        dest.writeInt(this.f20520c);
        dest.writeInt(this.f20521d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5387h(Parcel parcel) {
        AbstractC6118n.m27187e(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC6118n.m27184b(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
