package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.AbstractC4532h;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import p045F3.AbstractC0422b;
import p104N.AbstractC0910g;
import p104N.C0906c;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6750k;
import p397y3.AbstractC7539a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.z */
/* JADX INFO: loaded from: classes2.dex */
public class C4494z implements InterfaceC4477i {
    public static final Parcelable.Creator<C4494z> CREATOR = new c();

    /* JADX INFO: renamed from: a */
    private CharSequence f17017a;

    /* JADX INFO: renamed from: b */
    private String f17018b;

    /* JADX INFO: renamed from: c */
    private final String f17019c = " ";

    /* JADX INFO: renamed from: d */
    private Long f17020d = null;

    /* JADX INFO: renamed from: e */
    private Long f17021e = null;

    /* JADX INFO: renamed from: f */
    private Long f17022f = null;

    /* JADX INFO: renamed from: r */
    private Long f17023r = null;

    /* JADX INFO: renamed from: s */
    private SimpleDateFormat f17024s;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.z$a */
    class a extends AbstractC4474f {

        /* JADX INFO: renamed from: t */
        final /* synthetic */ TextInputLayout f17025t;

        /* JADX INFO: renamed from: u */
        final /* synthetic */ TextInputLayout f17026u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ AbstractC4492x f17027v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, C4469a c4469a, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractC4492x abstractC4492x) {
            super(str, dateFormat, textInputLayout, c4469a);
            this.f17025t = textInputLayout2;
            this.f17026u = textInputLayout3;
            this.f17027v = abstractC4492x;
        }

        @Override // com.google.android.material.datepicker.AbstractC4474f
        /* JADX INFO: renamed from: d */
        void mo20268d() {
            C4494z.this.f17022f = null;
            C4494z.this.m20421n(this.f17025t, this.f17026u, this.f17027v);
        }

        @Override // com.google.android.material.datepicker.AbstractC4474f
        /* JADX INFO: renamed from: e */
        void mo20269e(Long l7) {
            C4494z.this.f17022f = l7;
            C4494z.this.m20421n(this.f17025t, this.f17026u, this.f17027v);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.z$b */
    class b extends AbstractC4474f {

        /* JADX INFO: renamed from: t */
        final /* synthetic */ TextInputLayout f17029t;

        /* JADX INFO: renamed from: u */
        final /* synthetic */ TextInputLayout f17030u;

        /* JADX INFO: renamed from: v */
        final /* synthetic */ AbstractC4492x f17031v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, C4469a c4469a, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractC4492x abstractC4492x) {
            super(str, dateFormat, textInputLayout, c4469a);
            this.f17029t = textInputLayout2;
            this.f17030u = textInputLayout3;
            this.f17031v = abstractC4492x;
        }

        @Override // com.google.android.material.datepicker.AbstractC4474f
        /* JADX INFO: renamed from: d */
        void mo20268d() {
            C4494z.this.f17023r = null;
            C4494z.this.m20421n(this.f17029t, this.f17030u, this.f17031v);
        }

        @Override // com.google.android.material.datepicker.AbstractC4474f
        /* JADX INFO: renamed from: e */
        void mo20269e(Long l7) {
            C4494z.this.f17023r = l7;
            C4494z.this.m20421n(this.f17029t, this.f17030u, this.f17031v);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.z$c */
    class c implements Parcelable.Creator {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4494z createFromParcel(Parcel parcel) {
            C4494z c4494z = new C4494z();
            c4494z.f17020d = (Long) parcel.readValue(Long.class.getClassLoader());
            c4494z.f17021e = (Long) parcel.readValue(Long.class.getClassLoader());
            return c4494z;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4494z[] newArray(int i7) {
            return new C4494z[i7];
        }
    }

    /* JADX INFO: renamed from: f */
    private void m20417f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f17018b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    /* JADX INFO: renamed from: h */
    private boolean m20418h(long j7, long j8) {
        return j7 <= j8;
    }

    /* JADX INFO: renamed from: i */
    private void m20419i(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f17018b);
        textInputLayout2.setError(" ");
    }

    /* JADX INFO: renamed from: m */
    private void m20420m(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f17017a = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f17017a = null;
        } else {
            this.f17017a = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m20421n(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AbstractC4492x abstractC4492x) {
        Long l7 = this.f17022f;
        if (l7 == null || this.f17023r == null) {
            m20417f(textInputLayout, textInputLayout2);
            abstractC4492x.mo20364a();
        } else if (m20418h(l7.longValue(), this.f17023r.longValue())) {
            this.f17020d = this.f17022f;
            this.f17021e = this.f17023r;
            abstractC4492x.mo20365b(mo20279K());
        } else {
            m20419i(textInputLayout, textInputLayout2);
            abstractC4492x.mo20364a();
        }
        m20420m(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: A */
    public String mo20275A(Context context) {
        Resources resources = context.getResources();
        C0906c c0906cM20286a = AbstractC4478j.m20286a(this.f17020d, this.f17021e);
        Object obj = c0906cM20286a.f3546a;
        String string = obj == null ? resources.getString(AbstractC6750k.f26521u) : (String) obj;
        Object obj2 = c0906cM20286a.f3547b;
        return resources.getString(AbstractC6750k.f26520t, string, obj2 == null ? resources.getString(AbstractC6750k.f26521u) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: C */
    public int mo20276C(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return AbstractC0422b.m1822f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(AbstractC6744e.f26343f0) ? AbstractC6742c.f26216A : AbstractC6742c.f26285y, C4486r.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: F */
    public boolean mo20277F() {
        Long l7 = this.f17020d;
        return (l7 == null || this.f17021e == null || !m20418h(l7.longValue(), this.f17021e.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: I */
    public Collection mo20278I() {
        ArrayList arrayList = new ArrayList();
        Long l7 = this.f17020d;
        if (l7 != null) {
            arrayList.add(l7);
        }
        Long l8 = this.f17021e;
        if (l8 != null) {
            arrayList.add(l8);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: O */
    public void mo20280O(long j7) {
        Long l7 = this.f17020d;
        if (l7 == null) {
            this.f17020d = Long.valueOf(j7);
        } else if (this.f17021e == null && m20418h(l7.longValue(), j7)) {
            this.f17021e = Long.valueOf(j7);
        } else {
            this.f17021e = null;
            this.f17020d = Long.valueOf(j7);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0906c mo20279K() {
        return new C0906c(this.f17020d, this.f17021e);
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: j */
    public String mo20281j(Context context) {
        Resources resources = context.getResources();
        Long l7 = this.f17020d;
        if (l7 == null && this.f17021e == null) {
            return resources.getString(AbstractC6750k.f26487I);
        }
        Long l8 = this.f17021e;
        if (l8 == null) {
            return resources.getString(AbstractC6750k.f26484F, AbstractC4478j.m20288c(l7.longValue()));
        }
        if (l7 == null) {
            return resources.getString(AbstractC6750k.f26483E, AbstractC4478j.m20288c(l8.longValue()));
        }
        C0906c c0906cM20286a = AbstractC4478j.m20286a(l7, l8);
        return resources.getString(AbstractC6750k.f26485G, c0906cM20286a.f3546a, c0906cM20286a.f3547b);
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: k */
    public Collection mo20282k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0906c(this.f17020d, this.f17021e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo20283p(C0906c c0906c) {
        Object obj = c0906c.f3546a;
        if (obj != null && c0906c.f3547b != null) {
            AbstractC0910g.m4133a(m20418h(((Long) obj).longValue(), ((Long) c0906c.f3547b).longValue()));
        }
        Object obj2 = c0906c.f3546a;
        this.f17020d = obj2 == null ? null : Long.valueOf(AbstractC4466C.m20211a(((Long) obj2).longValue()));
        Object obj3 = c0906c.f3547b;
        this.f17021e = obj3 != null ? Long.valueOf(AbstractC4466C.m20211a(((Long) obj3).longValue())) : null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeValue(this.f17020d);
        parcel.writeValue(this.f17021e);
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: x */
    public View mo20284x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C4469a c4469a, AbstractC4492x abstractC4492x) {
        View viewInflate = layoutInflater.inflate(AbstractC6748i.f26451E, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(AbstractC6746g.f26402J);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(AbstractC6746g.f26401I);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer numM33175f = AbstractC7539a.m33175f(viewInflate.getContext(), AbstractC6742c.f26258i);
        if (numM33175f != null) {
            editText.setHintTextColor(numM33175f.intValue());
            editText2.setHintTextColor(numM33175f.intValue());
        }
        if (AbstractC4532h.m20707b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f17018b = viewInflate.getResources().getString(AbstractC6750k.f26479A);
        SimpleDateFormat simpleDateFormatM20216f = this.f17024s;
        boolean z7 = simpleDateFormatM20216f != null;
        if (!z7) {
            simpleDateFormatM20216f = AbstractC4466C.m20216f();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatM20216f;
        Long l7 = this.f17020d;
        if (l7 != null) {
            editText.setText(simpleDateFormat.format(l7));
            this.f17022f = this.f17020d;
        }
        Long l8 = this.f17021e;
        if (l8 != null) {
            editText2.setText(simpleDateFormat.format(l8));
            this.f17023r = this.f17021e;
        }
        String pattern = z7 ? simpleDateFormat.toPattern() : AbstractC4466C.m20217g(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, c4469a, textInputLayout, textInputLayout2, abstractC4492x));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat, textInputLayout2, c4469a, textInputLayout, textInputLayout2, abstractC4492x));
        if (!InterfaceC4477i.m20272P(viewInflate.getContext())) {
            InterfaceC4477i.m20273w(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.InterfaceC4477i
    /* JADX INFO: renamed from: y */
    public int mo20285y() {
        return AbstractC6750k.f26486H;
    }
}
