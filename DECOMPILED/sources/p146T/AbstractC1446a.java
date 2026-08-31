package p146T;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: T.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1446a implements Parcelable {

    /* JADX INFO: renamed from: a */
    private final Parcelable f4975a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC1446a f4974b = new a();
    public static final Parcelable.Creator<AbstractC1446a> CREATOR = new b();

    /* JADX INFO: renamed from: T.a$a */
    class a extends AbstractC1446a {
        a() {
            super((a) null);
        }
    }

    /* JADX INFO: renamed from: T.a$b */
    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1446a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1446a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1446a.f4974b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC1446a[] newArray(int i7) {
            return new AbstractC1446a[i7];
        }
    }

    /* synthetic */ AbstractC1446a(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public final Parcelable m6085a() {
        return this.f4975a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f4975a, i7);
    }

    private AbstractC1446a() {
        this.f4975a = null;
    }

    protected AbstractC1446a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4975a = parcelable == f4974b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractC1446a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f4975a = parcelable == null ? f4974b : parcelable;
    }
}
