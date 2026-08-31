package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5052m;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import p367u5.AbstractC7164C;
import p367u5.AbstractC7192w;
import p375v5.AbstractC7262a;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5033c extends AbstractC5059s {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5060t f19093c = new a();

    /* JADX INFO: renamed from: a */
    private final b f19094a;

    /* JADX INFO: renamed from: b */
    private final List f19095b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.c$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            a aVar = null;
            if (c5058a.m22814c() != Date.class) {
                return null;
            }
            int i7 = 2;
            return new C5033c(b.f19096b, i7, i7, aVar);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.c$b */
    public static abstract class b {

        /* JADX INFO: renamed from: b */
        public static final b f19096b = new a(Date.class);

        /* JADX INFO: renamed from: a */
        private final Class f19097a;

        /* JADX INFO: renamed from: com.google.gson.internal.bind.c$b$a */
        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.C5033c.b
            /* JADX INFO: renamed from: a */
            protected Date mo22665a(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f19097a = cls;
        }

        /* JADX INFO: renamed from: a */
        protected abstract Date mo22665a(Date date);
    }

    /* synthetic */ C5033c(b bVar, int i7, int i8, a aVar) {
        this(bVar, i7, i8);
    }

    /* JADX INFO: renamed from: e */
    private Date m22662e(C7415a c7415a) throws IOException {
        String strM32822b1 = c7415a.m32822b1();
        synchronized (this.f19095b) {
            try {
                for (DateFormat dateFormat : this.f19095b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            Date date = dateFormat.parse(strM32822b1);
                            dateFormat.setTimeZone(timeZone);
                            return date;
                        } catch (Throwable th) {
                            dateFormat.setTimeZone(timeZone);
                            throw th;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return AbstractC7262a.m32191c(strM32822b1, new ParsePosition(0));
                } catch (ParseException e7) {
                    throw new C5052m("Failed parsing '" + strM32822b1 + "' as Date; at path " + c7415a.m32830p0(), e7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date mo22636b(C7415a c7415a) throws IOException {
        if (c7415a.m32824d1() == EnumC7416b.NULL) {
            c7415a.m32821Z0();
            return null;
        }
        return this.f19094a.mo22665a(m22662e(c7415a));
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, Date date) throws IOException {
        String str;
        if (date == null) {
            c7417c.mo22681R0();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f19095b.get(0);
        synchronized (this.f19095b) {
            str = dateFormat.format(date);
        }
        c7417c.mo22687f1(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f19095b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private C5033c(b bVar, int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f19095b = arrayList;
        Objects.requireNonNull(bVar);
        this.f19094a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i7, i8, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i7, i8));
        }
        if (AbstractC7192w.m31743c()) {
            arrayList.add(AbstractC7164C.m31669c(i7, i8));
        }
    }
}
