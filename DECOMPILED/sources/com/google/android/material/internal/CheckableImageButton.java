package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C2366o;
import p111O.AbstractC1030Z;
import p111O.C1032a;
import p118P.C1170s;
import p146T.AbstractC1446a;
import p255h.AbstractC5520a;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends C2366o implements Checkable {

    /* JADX INFO: renamed from: r */
    private static final int[] f17186r = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    private boolean f17187d;

    /* JADX INFO: renamed from: e */
    private boolean f17188e;

    /* JADX INFO: renamed from: f */
    private boolean f17189f;

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C4522a extends C1032a {
        C4522a() {
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: f */
        public void mo4584f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4584f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p111O.C1032a
        /* JADX INFO: renamed from: g */
        public void mo4585g(View view, C1170s c1170s) {
            super.mo4585g(view, c1170s);
            c1170s.m5065k0(CheckableImageButton.this.m20592a());
            c1170s.m5067l0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C4523b extends AbstractC1446a {
        public static final Parcelable.Creator<C4523b> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        boolean f17191c;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4523b createFromParcel(Parcel parcel) {
                return new C4523b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4523b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4523b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4523b[] newArray(int i7) {
                return new C4523b[i7];
            }
        }

        public C4523b(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: b */
        private void m20593b(Parcel parcel) {
            this.f17191c = parcel.readInt() == 1;
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17191c ? 1 : 0);
        }

        public C4523b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m20593b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20951B);
    }

    /* JADX INFO: renamed from: a */
    public boolean m20592a() {
        return this.f17188e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f17187d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        if (!this.f17187d) {
            return super.onCreateDrawableState(i7);
        }
        int[] iArr = f17186r;
        return View.mergeDrawableStates(super.onCreateDrawableState(i7 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4523b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4523b c4523b = (C4523b) parcelable;
        super.onRestoreInstanceState(c4523b.m6085a());
        setChecked(c4523b.f17191c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C4523b c4523b = new C4523b(super.onSaveInstanceState());
        c4523b.f17191c = this.f17187d;
        return c4523b;
    }

    public void setCheckable(boolean z7) {
        if (this.f17188e != z7) {
            this.f17188e = z7;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        if (!this.f17188e || this.f17187d == z7) {
            return;
        }
        this.f17187d = z7;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z7) {
        this.f17189f = z7;
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        if (this.f17189f) {
            super.setPressed(z7);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f17187d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17188e = true;
        this.f17189f = true;
        AbstractC1030Z.m4474j0(this, new C4522a());
    }
}
