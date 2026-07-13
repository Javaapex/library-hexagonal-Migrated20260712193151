package io.wkrzywiec.hexagonal.library;

import io.wkrzywiec.hexagonal.library.domain.inventory.core.model.Author;
import io.wkrzywiec.hexagonal.library.domain.inventory.core.model.Book;
import io.wkrzywiec.hexagonal.library.domain.inventory.core.model.BookIdentification;
import io.wkrzywiec.hexagonal.library.domain.inventory.core.model.Isbn10;
import io.wkrzywiec.hexagonal.library.domain.inventory.core.model.Isbn13;

import java.util.Collections;

public class BookTestData {

    public static String homoDeusBookGoogleId() {
        return "dWYyCwAAQBAJ";
    }

    public static String homoDeusBookTitle() {
        return "Homo Deus";
    }

    public static Book homoDeusBook() {
        Isbn10 isbn10 = new Isbn10("1473545374");
        Isbn13 isbn13 = new Isbn13("9781473545373");

        return new Book(
                new BookIdentification(homoDeusBookGoogleId(), isbn10, isbn13),
                homoDeusBookTitle(),
                Collections.singleton(new Author("Yuval Noah Harari")),
                "Random House",
                "2016-09-08",
                "<p><b>**THE MILLION COPY BESTSELLER**</b><br> <b></b><br><b> <i>Sapiens </i>showed us where we came from. In uncertain times, <i>Homo Deus</i> shows us where we’re going.</b></p><p> Yuval Noah Harari envisions a near future in which we face a new set of challenges. <i>Homo Deus</i> explores the projects, dreams and nightmares that will shape the twenty-first century and beyond – from overcoming death to creating artificial life.</p><p> It asks the fundamental questions: how can we protect this fragile world from our own destructive power? And what does our future hold?<br> <b></b><br><b> '<i>Homo Deus</i> will shock you. It will entertain you. It will make you think in ways you had not thought before’ Daniel Kahneman, bestselling author of <i>Thinking, Fast and Slow</i></b></p>",
                528,
                        "http://books.google.com/books/content?id=dWYyCwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&imgtk=AFLRE73PkLs4TNB-W2uhDvXJkIB4-9G9AJ_L1iYTYLEXa3zi2kahdsN9-_0tL7WRWgujNpjMA5ZuJO7_ykFUlCWAyLzcQVcGkqUS-NOkUkEcJ_ZRrgq48URpcfBrJWQCwSWtHo5pEGkp&source=gbs_api"
        );
    }

    public static String homoDeusGooleBooksResponse(){
        return """
                {
                    "kind": "books#volume",
                    "id": "dWYyCwAAQBAJ",
                    "etag": "wPk+fCNOrUc",
                    "selfLink": "https://www.googleapis.com/books/v1/volumes/dWYyCwAAQBAJ",
                    "volumeInfo": {
                        "title": "Homo Deus",
                        "subtitle": "A Brief History of Tomorrow",
                        "authors": [
                            "Yuval Noah Harari"
                        ],
                        "publisher": "Random House",
                        "publishedDate": "2016-09-08",
                        "description": "<p><b>**THE MILLION COPY BESTSELLER**</b><br> <b></b><br><b> <i>Sapiens </i>showed us where we came from. In uncertain times, <i>Homo Deus</i> shows us where we’re going.</b></p><p> Yuval Noah Harari envisions a near future in which we face a new set of challenges. <i>Homo Deus</i> explores the projects, dreams and nightmares that will shape the twenty-first century and beyond – from overcoming death to creating artificial life.</p><p> It asks the fundamental questions: how can we protect this fragile world from our own destructive power? And what does our future hold?<br> <b></b><br><b> '<i>Homo Deus</i> will shock you. It will entertain you. It will make you think in ways you had not thought before’ Daniel Kahneman, bestselling author of <i>Thinking, Fast and Slow</i></b></p>",
                        "industryIdentifiers": [
                            {
                                "type": "ISBN_10",
                                "identifier": "1473545374"
                            },
                            {
                                "type": "ISBN_13",
                                "identifier": "9781473545373"
                            }
                        ],
                        "readingModes": {
                            "text": true,
                            "image": false
                        },
                        "pageCount": 528,
                        "printedPageCount": 450,
                        "printType": "BOOK",
                        "categories": [
                            "Social Science / Future Studies",
                            "Social Science / Anthropology / Cultural & Social",
                            "Science / Biotechnology",
                            "Science / Nanoscience",
                            "Political Science / Public Policy / Science & Technology Policy",
                            "History / Modern / 21st Century",
                            "Science / General",
                            "Science / Philosophy & Social Aspects",
                            "History / Social History",
                            "Social Science / Sociology / General"
                        ],
                        "averageRating": 4.0,
                        "ratingsCount": 21,
                        "maturityRating": "NOT_MATURE",
                        "allowAnonLogging": true,
                        "contentVersion": "1.41.33.0.preview.2",
                        "panelizationSummary": {
                            "containsEpubBubbles": false,
                            "containsImageBubbles": false
                        },
                        "imageLinks": {
                            "smallThumbnail": "http://books.google.com/books/content?id=dWYyCwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&imgtk=AFLRE71OlPqFEmYBczVB1QuQTgmU-vkAdiIDl6Q1djoNlXJI7xb5V06A3mHcOtkzOqXtfnlw133xD8dCeEKpDpNstSHy07WiH0Fkt8yXdW0LT8LMZ7_KCkOpgEVD9Eo4tlQ5kicNM4Hp&source=gbs_api",
                            "thumbnail": "http://books.google.com/books/content?id=dWYyCwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&imgtk=AFLRE73PkLs4TNB-W2uhDvXJkIB4-9G9AJ_L1iYTYLEXa3zi2kahdsN9-_0tL7WRWgujNpjMA5ZuJO7_ykFUlCWAyLzcQVcGkqUS-NOkUkEcJ_ZRrgq48URpcfBrJWQCwSWtHo5pEGkp&source=gbs_api",
                            "small": "http://books.google.com/books/content?id=dWYyCwAAQBAJ&printsec=frontcover&img=1&zoom=2&edge=curl&imgtk=AFLRE72Hw87YN1yYrX7vZ7pIE2BFC8lRKouBK8D8tam_3h-kLqGH2DnwMotN-fVyev2VlOQ0trvVzFBja3j0FyCVkGDrp78CJPVQAETemt5dRYbW51J0Nf9KB2bcglA_PJ9et8FZ9lB7&source=gbs_api",
                            "medium": "http://books.google.com/books/content?id=dWYyCwAAQBAJ&printsec=frontcover&img=1&zoom=3&edge=curl&imgtk=AFLRE72bKjGOHIXNZpYJV2m3UtVBm0BQfnGQDR77ngtm4dza2jUTWh3QZg2OzQB9OQMpaoi7BD_27Yvo50xXs-m0sOuIWvmQI84F5beXggyiq1PxiayP8gONj4yZYJGGrD5L2peyY-WE&source=gbs_api"
                        },
                        "language": "en",
                        "previewLink": "http://books.google.pl/books?id=dWYyCwAAQBAJ&hl=&source=gbs_api",
                        "infoLink": "https://play.google.com/store/books/details?id=dWYyCwAAQBAJ&source=gbs_api",
                        "canonicalVolumeLink": "https://play.google.com/store/books/details?id=dWYyCwAAQBAJ"
                    },
                    "layerInfo": {
                        "layers": [
                            {
                                "layerId": "geo",
                                "volumeAnnotationsVersion": "52"
                            }
                        ]
                    },
                    "saleInfo": {
                        "country": "PL",
                        "saleability": "FOR_SALE",
                        "isEbook": true,
                        "listPrice": {
                            "amount": 37.99,
                            "currencyCode": "PLN"
                        },
                        "retailPrice": {
                            "amount": 37.99,
                            "currencyCode": "PLN"
                        },
                        "buyLink": "https://play.google.com/store/books/details?id=dWYyCwAAQBAJ&rdid=book-dWYyCwAAQBAJ&rdot=1&source=gbs_api",
                        "offers": [
                            {
                                "finskyOfferType": 1,
                                "listPrice": {
                                    "amountInMicros": 3.799E7,
                                    "currencyCode": "PLN"
                                },
                                "retailPrice": {
                                    "amountInMicros": 3.799E7,
                                    "currencyCode": "PLN"
                                }
                            }
                        ]
                    },
                    "accessInfo": {
                        "country": "PL",
                        "viewability": "PARTIAL",
                        "embeddable": true,
                        "publicDomain": false,
                        "textToSpeechPermission": "ALLOWED_FOR_ACCESSIBILITY",
                        "epub": {
                            "isAvailable": true,
                            "acsTokenLink": "http://books.google.pl/books/download/Homo_Deus-sample-epub.acsm?id=dWYyCwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
                        },
                        "pdf": {
                            "isAvailable": false
                        },
                        "webReaderLink": "http://play.google.com/books/reader?id=dWYyCwAAQBAJ&hl=&printsec=frontcover&source=gbs_api",
                        "accessViewStatus": "SAMPLE",
                        "quoteSharingAllowed": false
                    }
                }\
                """;
    }

    public static String harryPotterSearchResponse() {
        return """
                {
                    "kind": "books#volumes",
                    "totalItems": 614,
                    "items": [
                        {
                            "kind": "books#volume",
                            "id": "DKcWE3WXoj8C",
                            "etag": "iSwGmNbM3iE",
                            "selfLink": "https://www.googleapis.com/books/v1/volumes/DKcWE3WXoj8C",
                            "volumeInfo": {
                                "title": "Harry Potter and International Relations",
                                "authors": [
                                    "Daniel H. Nexon",
                                    "Iver B. Neumann"
                                ],
                                "publisher": "Rowman & Littlefield",
                                "publishedDate": "2006",
                                "description": "Drawing on a range of historical and sociological sources, this work shows how aspects of Harry's world contain aspects of our own. It also includes chapters on the political economy of the franchise, and on the problems of studying popular culture.",
                                "industryIdentifiers": [
                                    {
                                        "type": "ISBN_10",
                                        "identifier": "0742539598"
                                    },
                                    {
                                        "type": "ISBN_13",
                                        "identifier": "9780742539594"
                                    }
                                ],
                                "readingModes": {
                                    "text": false,
                                    "image": true
                                },
                                "pageCount": 245,
                                "printType": "BOOK",
                                "categories": [
                                    "Literary Criticism"
                                ],
                                "averageRating": 3.5,
                                "ratingsCount": 7,
                                "maturityRating": "NOT_MATURE",
                                "allowAnonLogging": false,
                                "contentVersion": "preview-1.0.0",
                                "panelizationSummary": {
                                    "containsEpubBubbles": false,
                                    "containsImageBubbles": false
                                },
                                "imageLinks": {
                                    "smallThumbnail": "http://books.google.com/books/content?id=DKcWE3WXoj8C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
                                    "thumbnail": "http://books.google.com/books/content?id=DKcWE3WXoj8C&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
                                },
                                "language": "en",
                                "previewLink": "http://books.google.pl/books?id=DKcWE3WXoj8C&printsec=frontcover&dq=harry+potter&hl=&as_pt=BOOKS&cd=1&source=gbs_api",
                                "infoLink": "http://books.google.pl/books?id=DKcWE3WXoj8C&dq=harry+potter&hl=&as_pt=BOOKS&source=gbs_api",
                                "canonicalVolumeLink": "https://books.google.com/books/about/Harry_Potter_and_International_Relations.html?hl=&id=DKcWE3WXoj8C"
                            },
                            "saleInfo": {
                                "country": "PL",
                                "saleability": "NOT_FOR_SALE",
                                "isEbook": false
                            },
                            "accessInfo": {
                                "country": "PL",
                                "viewability": "PARTIAL",
                                "embeddable": true,
                                "publicDomain": false,
                                "textToSpeechPermission": "ALLOWED",
                                "epub": {
                                    "isAvailable": false
                                },
                                "pdf": {
                                    "isAvailable": true,
                                    "acsTokenLink": "http://books.google.pl/books/download/Harry_Potter_and_International_Relations-sample-pdf.acsm?id=DKcWE3WXoj8C&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
                                },
                                "webReaderLink": "http://play.google.com/books/reader?id=DKcWE3WXoj8C&hl=&as_pt=BOOKS&printsec=frontcover&source=gbs_api",
                                "accessViewStatus": "SAMPLE",
                                "quoteSharingAllowed": false
                            },
                            "searchInfo": {
                                "textSnippet": "Drawing on a range of historical and sociological sources, this work shows how aspects of Harry&#39;s world contain aspects of our own."
                            }
                        },
                        {
                            "kind": "books#volume",
                            "id": "Aaug_RnI-xQC",
                            "etag": "CcHxn+l25b4",
                            "selfLink": "https://www.googleapis.com/books/v1/volumes/Aaug_RnI-xQC",
                            "volumeInfo": {
                                "title": "The Irresistible Rise of Harry Potter",
                                "authors": [
                                    "Andrew Blake"
                                ],
                                "publisher": "Verso",
                                "publishedDate": "2002",
                                "description": "Blake's examination of the Potter phenomenon raises serious questions about the condition of the publishing industry, filmmaking, and the ways in which the Potter consumer campaign has changed ideas about literature and reading.",
                                "industryIdentifiers": [
                                    {
                                        "type": "ISBN_10",
                                        "identifier": "1859846661"
                                    },
                                    {
                                        "type": "ISBN_13",
                                        "identifier": "9781859846667"
                                    }
                                ],
                                "readingModes": {
                                    "text": false,
                                    "image": true
                                },
                                "pageCount": 118,
                                "printType": "BOOK",
                                "categories": [
                                    "Literary Criticism"
                                ],
                                "averageRating": 4.5,
                                "ratingsCount": 5,
                                "maturityRating": "NOT_MATURE",
                                "allowAnonLogging": false,
                                "contentVersion": "1.1.2.0.preview.1",
                                "panelizationSummary": {
                                    "containsEpubBubbles": false,
                                    "containsImageBubbles": false
                                },
                                "imageLinks": {
                                    "smallThumbnail": "http://books.google.com/books/content?id=Aaug_RnI-xQC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
                                    "thumbnail": "http://books.google.com/books/content?id=Aaug_RnI-xQC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
                                },
                                "language": "en",
                                "previewLink": "http://books.google.pl/books?id=Aaug_RnI-xQC&printsec=frontcover&dq=harry+potter&hl=&as_pt=BOOKS&cd=2&source=gbs_api",
                                "infoLink": "http://books.google.pl/books?id=Aaug_RnI-xQC&dq=harry+potter&hl=&as_pt=BOOKS&source=gbs_api",
                                "canonicalVolumeLink": "https://books.google.com/books/about/The_Irresistible_Rise_of_Harry_Potter.html?hl=&id=Aaug_RnI-xQC"
                            },
                            "saleInfo": {
                                "country": "PL",
                                "saleability": "NOT_FOR_SALE",
                                "isEbook": false
                            },
                            "accessInfo": {
                                "country": "PL",
                                "viewability": "PARTIAL",
                                "embeddable": true,
                                "publicDomain": false,
                                "textToSpeechPermission": "ALLOWED",
                                "epub": {
                                    "isAvailable": false
                                },
                                "pdf": {
                                    "isAvailable": false
                                },
                                "webReaderLink": "http://play.google.com/books/reader?id=Aaug_RnI-xQC&hl=&as_pt=BOOKS&printsec=frontcover&source=gbs_api",
                                "accessViewStatus": "SAMPLE",
                                "quoteSharingAllowed": false
                            },
                            "searchInfo": {
                                "textSnippet": "Blake&#39;s examination of the Potter phenomenon raises serious questions about the condition of the publishing industry, filmmaking, and the ways in which the Potter consumer campaign has changed ideas about literature and reading."
                            }
                        },
                        {
                            "kind": "books#volume",
                            "id": "3PGBUrScs-YC",
                            "etag": "GCMKjP2WQk4",
                            "selfLink": "https://www.googleapis.com/books/v1/volumes/3PGBUrScs-YC",
                            "volumeInfo": {
                                "title": "Harry Potter and the Bible",
                                "subtitle": "The Menace Behind the Magick",
                                "authors": [
                                    "Richard Abanes"
                                ],
                                "publisher": "Wingspread Pub",
                                "publishedDate": "2001-01-01",
                                "description": "Is the Harry Potter phenomena harmless fantasy or dangerous fascination? This book catalogs various forms of occultism included in the first four Harry Potter books and warns against spiritual dangers.",
                                "industryIdentifiers": [
                                    {
                                        "type": "ISBN_10",
                                        "identifier": "0889652015"
                                    },
                                    {
                                        "type": "ISBN_13",
                                        "identifier": "9780889652019"
                                    }
                                ],
                                "readingModes": {
                                    "text": false,
                                    "image": false
                                },
                                "pageCount": 275,
                                "printType": "BOOK",
                                "categories": [
                                    "Religion"
                                ],
                                "averageRating": 4.0,
                                "ratingsCount": 5,
                                "maturityRating": "NOT_MATURE",
                                "allowAnonLogging": false,
                                "contentVersion": "1.0.0.0.preview.0",
                                "imageLinks": {
                                    "smallThumbnail": "http://books.google.com/books/content?id=3PGBUrScs-YC&printsec=frontcover&img=1&zoom=5&source=gbs_api",
                                    "thumbnail": "http://books.google.com/books/content?id=3PGBUrScs-YC&printsec=frontcover&img=1&zoom=1&source=gbs_api"
                                },
                                "language": "en",
                                "previewLink": "http://books.google.pl/books?id=3PGBUrScs-YC&q=harry+potter&dq=harry+potter&hl=&as_pt=BOOKS&cd=3&source=gbs_api",
                                "infoLink": "http://books.google.pl/books?id=3PGBUrScs-YC&dq=harry+potter&hl=&as_pt=BOOKS&source=gbs_api",
                                "canonicalVolumeLink": "https://books.google.com/books/about/Harry_Potter_and_the_Bible.html?hl=&id=3PGBUrScs-YC"
                            },
                            "saleInfo": {
                                "country": "PL",
                                "saleability": "NOT_FOR_SALE",
                                "isEbook": false
                            },
                            "accessInfo": {
                                "country": "PL",
                                "viewability": "NO_PAGES",
                                "embeddable": false,
                                "publicDomain": false,
                                "textToSpeechPermission": "ALLOWED",
                                "epub": {
                                    "isAvailable": false
                                },
                                "pdf": {
                                    "isAvailable": false
                                },
                                "webReaderLink": "http://play.google.com/books/reader?id=3PGBUrScs-YC&hl=&as_pt=BOOKS&printsec=frontcover&source=gbs_api",
                                "accessViewStatus": "NONE",
                                "quoteSharingAllowed": false
                            },
                            "searchInfo": {
                                "textSnippet": "Examines J.K. Rowling&#39;s &quot;Harry Potter&quot; books, discussing their use of occult imagery and their potential dangers to Christians, and compares them to the &quot;safer&quot; works of C.S. Lewis and J.R.R. Tolkien."
                            }
                        },
                        {
                            "kind": "books#volume",
                            "id": "iO5pApw2JycC",
                            "etag": "3V/Rwx8vImI",
                            "selfLink": "https://www.googleapis.com/books/v1/volumes/iO5pApw2JycC",
                            "volumeInfo": {
                                "title": "The Ivory Tower and Harry Potter",
                                "subtitle": "Perspectives on a Literary Phenomenon",
                                "authors": [
                                    "Lana A. Whited"
                                ],
                                "publisher": "University of Missouri Press",
                                "publishedDate": "2004",
                                "description": "Now available in paper, The Ivory Tower and Harry Potter is the first book-length analysis of J. K. Rowling's work from a broad range of perspectives within literature, folklore, psychology, sociology, and popular culture. A significant portion of the book explores the Harry Potter series' literary ancestors, including magic and fantasy works by Ursula K. LeGuin, Monica Furlong, Jill Murphy, and others, as well as previous works about the British boarding school experience. Other chapters explore the moral and ethical dimensions of Harry's world, including objections to the series raised within some religious circles. In her new epilogue, Lana A. Whited brings this volume up to date by covering Rowling's latest book, Harry Potter and the Order of the Phoenix.",
                                "industryIdentifiers": [
                                    {
                                        "type": "ISBN_10",
                                        "identifier": "0826215491"
                                    },
                                    {
                                        "type": "ISBN_13",
                                        "identifier": "9780826215499"
                                    }
                                ],
                                "readingModes": {
                                    "text": true,
                                    "image": true
                                },
                                "pageCount": 418,
                                "printType": "BOOK",
                                "categories": [
                                    "Literary Criticism"
                                ],
                                "averageRating": 4.5,
                                "ratingsCount": 13,
                                "maturityRating": "NOT_MATURE",
                                "allowAnonLogging": false,
                                "contentVersion": "2.0.5.0.preview.3",
                                "panelizationSummary": {
                                    "containsEpubBubbles": false,
                                    "containsImageBubbles": false
                                },
                                "imageLinks": {
                                    "smallThumbnail": "http://books.google.com/books/content?id=iO5pApw2JycC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
                                    "thumbnail": "http://books.google.com/books/content?id=iO5pApw2JycC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
                                },
                                "language": "en",
                                "previewLink": "http://books.google.pl/books?id=iO5pApw2JycC&pg=PA329&dq=harry+potter&hl=&as_pt=BOOKS&cd=4&source=gbs_api",
                                "infoLink": "http://books.google.pl/books?id=iO5pApw2JycC&dq=harry+potter&hl=&as_pt=BOOKS&source=gbs_api",
                                "canonicalVolumeLink": "https://books.google.com/books/about/The_Ivory_Tower_and_Harry_Potter.html?hl=&id=iO5pApw2JycC"
                            },
                            "saleInfo": {
                                "country": "PL",
                                "saleability": "NOT_FOR_SALE",
                                "isEbook": false
                            },
                            "accessInfo": {
                                "country": "PL",
                                "viewability": "PARTIAL",
                                "embeddable": true,
                                "publicDomain": false,
                                "textToSpeechPermission": "ALLOWED",
                                "epub": {
                                    "isAvailable": true,
                                    "acsTokenLink": "http://books.google.pl/books/download/The_Ivory_Tower_and_Harry_Potter-sample-epub.acsm?id=iO5pApw2JycC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
                                },
                                "pdf": {
                                    "isAvailable": false
                                },
                                "webReaderLink": "http://play.google.com/books/reader?id=iO5pApw2JycC&hl=&as_pt=BOOKS&printsec=frontcover&source=gbs_api",
                                "accessViewStatus": "SAMPLE",
                                "quoteSharingAllowed": false
                            },
                            "searchInfo": {
                                "textSnippet": "<b>Harry</b>. <b>Potter</b>. and. the. Technology. of. Magic. Elizabeth Teare The July/August <br>\\n2001 issue of Book lists J. K. Rowling as one of the ten most influential people in <br>\\npublishing.1 She shares space on this list with John Grisham and Oprah Winfrey,<br>\\n&nbsp;..."
                            }
                        }
                    ]
                }\
                """;
    }

    public static String noBooksSearchResponse() {
        return """
                {
                    "kind": "books#volumes",
                    "totalItems": 0
                }\
                """;
    }
}

