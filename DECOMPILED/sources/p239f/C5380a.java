package p239f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5380a implements Parcelable {

    /* JADX INFO: renamed from: a */
    private final int f20493a;

    /* JADX INFO: renamed from: b */
    private final Intent f20494b;

    /* JADX INFO: renamed from: c */
    public static final b f20492c = new b(null);
    public static final Parcelable.Creator<C5380a> CREATOR = new a();

    /* JADX INFO: renamed from: f.a$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5380a createFromParcel(Parcel parcel) {
            AbstractC6118n.m27187e(parcel, "parcel");
            return new C5380a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5380a[] newArray(int i7) {
            return new C5380a[i7];
        }
    }

    /* JADX INFO: renamed from: f.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m24393a(int i7) {
            if (i7 != -1) {
                return i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private b() {
        }
    }

    public C5380a(int i7, Intent intent) {
        this.f20493a = i7;
        this.f20494b = intent;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m24389a() {
        return this.f20494b;
    }

    /* JADX INFO: renamed from: b */
    public final int m24390b() {
        return this.f20493a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f20492c.m24393a(this.f20493a) + ", data=" + this.f20494b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        AbstractC6118n.m27187e(dest, "dest");
        dest.writeInt(this.f20493a);
        dest.writeInt(this.f20494b == null ? 0 : 1);
        Intent intent = this.f20494b;
        if (intent != null) {
            intent.writeToParcel(dest, i7);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5380a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        AbstractC6118n.m27187e(parcel, "parcel");
    }
}
